package com.example.Service.impl;

import com.example.entity.Orderdetail;
import com.example.dao.OrderdetailDao;
import com.example.Service.OrderdetailService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (Orderdetail)表服务实现类
 *
 * @author makejava
 * @since 2022-05-23 16:34:44
 */
@Service("orderdetailService")
public class OrderdetailServiceImpl implements OrderdetailService {
    @Resource
    private OrderdetailDao orderdetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param odid 主键
     * @return 实例对象
     */
    @Override
    public Orderdetail queryById(Integer odid) {
        return this.orderdetailDao.queryById(odid);
    }

    /**
     * 分页查询
     *
     * @param orderdetail 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<Orderdetail> queryByPage(Orderdetail orderdetail, PageRequest pageRequest) {
        long total = this.orderdetailDao.count(orderdetail);
        return new PageImpl<>(this.orderdetailDao.queryAllByLimit(orderdetail, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param orderdetail 实例对象
     * @return 实例对象
     */
    @Override
    public Orderdetail insert(Orderdetail orderdetail) {
        this.orderdetailDao.insert(orderdetail);
        return orderdetail;
    }

    /**
     * 修改数据
     *
     * @param orderdetail 实例对象
     * @return 实例对象
     */
    @Override
    public Orderdetail update(Orderdetail orderdetail) {
        this.orderdetailDao.update(orderdetail);
        return this.queryById(orderdetail.getOdid());
    }

    /**
     * 通过主键删除数据
     *
     * @param odid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer odid) {
        return this.orderdetailDao.deleteById(odid) > 0;
    }
}
