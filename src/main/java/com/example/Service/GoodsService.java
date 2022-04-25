package com.example.Service;

import com.example.entity.Goods;

import java.util.ArrayList;

public interface GoodsService {
    ArrayList<Goods> queryAll();

    int deleteByID(Integer id);

    Goods findById(Integer id);

    int update(Goods goods);

    int insert(Goods goods);
}
