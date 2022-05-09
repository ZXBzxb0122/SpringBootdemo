package com.example.Controller;


import com.example.Service.impl.GoodsServiceImpl;
import com.example.Service.impl.GoodstypeServiceImpl;
import com.github.pagehelper.PageInfo;
import com.example.entity.Goods;
import com.example.entity.Goodstype;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;

@Api("商品信息控制类")
@Controller
@RequestMapping("/admin")
public class GoodsCtrl {
    @Resource
    GoodsServiceImpl goodsService;

    @Resource
    GoodstypeServiceImpl goodstypeService;
    @RequestMapping(value = "/goods",method = {RequestMethod.POST,RequestMethod.GET})
    public String findAllGoods(Model model,
                               @RequestParam(value = "pageNum",required = false, defaultValue = "1") Integer pageNum
            , @RequestParam(value = "pageSize",required = false, defaultValue = "4") Integer pageSize){
        PageInfo<Goods> goodsList =  goodsService.queryAll(pageNum,pageSize);
        model.addAttribute("goodsListPage",goodsList);
        return "goodsList";
    }
    @ApiOperation("根据ID删除商品")
    @GetMapping("/delGoods/{id}")
    public String delGoods(@PathVariable("id") int id,Model model){
        int num = goodsService.deleteByID(id);
        model.addAttribute("msg","删除成功");
        return "forward:/admin/goods";
    }

    @GetMapping("/goods/{id}")
    public String getGoodsById(@PathVariable("id") int id,Model model){
        Goods goods = goodsService.findById(id);
        ArrayList <Goodstype> list= goodstypeService.queryAll();
        model.addAttribute("goods",goods);
        model.addAttribute("goodstypelist",list);
        return "goodsEdit";
    }


    @PostMapping("/editGoods")
    public String addGoods(Goods goods,Model model){

        System.out.println(goods);
        int num = goodsService.update(goods);
        model.addAttribute("msg","商品信息更新成功！");
        return "forward:/admin/goods";
    }

    @GetMapping("/gotoAddGoods")
    public String gotoAdd(Model model){
        ArrayList<Goodstype> goodstypesList = goodstypeService.queryAll();
        model.addAttribute("goodstypesList",goodstypesList);
        return "addGoods";
    }

    @PostMapping("/addGoods")
    public String addGoods(Goods goods){
        int num = goodsService.insert(goods);
        return "forward:/admin/goods";
    }
    @GetMapping("/test")
    public Goods test(){
        return  new Goods();
    }
}