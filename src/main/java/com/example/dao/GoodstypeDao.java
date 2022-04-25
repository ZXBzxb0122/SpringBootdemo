package com.example.dao;

import com.example.entity.Goodstype;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface GoodstypeDao {

    @Select("select * from goodstype where tid = #{tid}")
    Goodstype queryBytID(Integer tid);

    @Delete("delete from goodstype where tid = #{id}")
    int deleteById(Integer id);

    @Select("select * from goodstype")
    ArrayList<Goodstype> queryAll();
}
