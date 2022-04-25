package com.example.Service.impl;

import com.example.Service.GoodsService;
import com.example.dao.GoodsDao;
import com.example.entity.Goods;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Resource
    GoodsDao goodsDao;

    @Override  //父类重写
    public ArrayList<Goods> queryAll() {
        return goodsDao.queryAll();
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
