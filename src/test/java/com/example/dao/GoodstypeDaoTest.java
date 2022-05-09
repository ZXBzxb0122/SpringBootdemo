package com.example.dao;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GoodstypeDaoTest {
    @Resource
    GoodstypeDao dao;

    @Test
    void queryBytID() {
        System.out.println(dao.queryBytID(1));
    }

    @Test
    void deleteById() {

    }
}