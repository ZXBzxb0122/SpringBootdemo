package com.example.Service.impl;


import com.example.Service.AdminuserService;
import com.example.dao.AdminuserMapper;
import com.example.entity.Adminuser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AdminuserServiceImpl implements AdminuserService {

    @Resource
    AdminuserMapper adminuserMapper;

    @Override
    public Adminuser geAdminUser(Adminuser adminuser) {
        return adminuserMapper.geAdminUser(adminuser);
    }
}
