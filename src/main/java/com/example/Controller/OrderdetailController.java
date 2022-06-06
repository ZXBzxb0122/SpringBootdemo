package com.example.Controller;

import com.example.Service.OrderdetailService;
import com.example.entity.Orderdetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Orderdetail)表控制层
 *
 * @author makejava
 * @since 2022-05-23 17:36:57
 */
@RestController
@RequestMapping("orderdetail")
public class OrderdetailController {
    /**
     * 服务对象
     */
    @Resource
    private OrderdetailService orderdetailService;

    @RequestMapping(value = "/orders")
    public String toOrders(Model model){
        model.addAttribute("ordersListPage",orderdetailService);
        return "orders";
    }
    /**
     * 分页查询
     *
     * @param orderdetail 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Orderdetail>> queryByPage(Orderdetail orderdetail, PageRequest pageRequest) {
        return ResponseEntity.ok(this.orderdetailService.queryByPage(orderdetail, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Orderdetail> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.orderdetailService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param orderdetail 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Orderdetail> add(Orderdetail orderdetail) {
        return ResponseEntity.ok(this.orderdetailService.insert(orderdetail));
    }

    /**
     * 编辑数据
     *
     * @param orderdetail 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Orderdetail> edit(Orderdetail orderdetail) {
        return ResponseEntity.ok(this.orderdetailService.update(orderdetail));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.orderdetailService.deleteById(id));
    }

}

