package com.example.Service;

import com.example.entity.Goodstype;

import java.util.ArrayList;

public interface GoodstypeService {

    ArrayList<Goodstype> queryAll();

    Goodstype queryBytID(Integer tid);
}
