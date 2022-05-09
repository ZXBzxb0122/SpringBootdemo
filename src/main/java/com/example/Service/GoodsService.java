package com.example.Service;

import com.example.entity.Goods;
import com.github.pagehelper.PageInfo;


public interface GoodsService {
    PageInfo<Goods> queryAll(Integer pageNum, Integer pageSize);

    int deleteByID(Integer id);

    Goods findById(Integer id);

    int update(Goods goods);

    int insert(Goods goods);
}
