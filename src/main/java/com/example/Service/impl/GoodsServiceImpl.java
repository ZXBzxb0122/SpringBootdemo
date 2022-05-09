package com.example.Service.impl;

import com.example.Service.GoodsService;
import com.example.dao.GoodsDao;
import com.example.entity.Goods;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    GoodsDao goodsDao;

    @Override
    public PageInfo<Goods> queryAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Goods> list = goodsDao.queryAll();
        PageInfo<Goods> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public int deleteByID(Integer id) {
        return goodsDao.deleteByID(id);
    }

    @Override
    public Goods findById(Integer id) {
        return goodsDao.findById(id);
    }

    @Override
    public int update(Goods goods) {
        return goodsDao.update(goods);
    }

    @Override
    public int insert(Goods goods) {
        return goodsDao.insert(goods);
    }

}
