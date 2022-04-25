package com.example.Service.impl;

import com.example.Service.GoodstypeService;
import com.example.dao.GoodstypeDao;
import com.example.entity.Goodstype;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class GoodstypeServiceImpl implements GoodstypeService {
    @Resource
    GoodstypeDao goodstypeDao;

    @Override
    public ArrayList<Goodstype> queryAll() {
        return goodstypeDao.queryAll();
    }

    @Override
    public Goodstype queryBytID(Integer tid) {
        return goodstypeDao.queryBytID(tid);
    }
}