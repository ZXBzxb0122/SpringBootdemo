package com.example.Controller;


import com.example.Service.impl.GoodsServiceImpl;
import com.example.Service.impl.GoodstypeServiceImpl;
import com.example.entity.Goods;
import com.example.entity.Goodstype;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;

@Controller
@RequestMapping("/admin")
public class GoodsCtrl {
    @Resource
    GoodsServiceImpl goodsService;

    @Resource
    GoodstypeServiceImpl goodstypeService;

    @RequestMapping(value = "/goods")
    public String findAllGoods(Model model){
        ArrayList<Goods> goodsList =  goodsService.queryAll();
        model.addAttribute("goodsList",goodsList);
        return "goodsList";
    }

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
}