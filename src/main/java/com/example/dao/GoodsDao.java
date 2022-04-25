package com.example.dao;

import com.example.entity.Goods;
import com.example.entity.Goodstype;
import org.apache.catalina.User;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface GoodsDao {

    @Results({
            @Result(column = "tID",property = "goodstype",javaType = Goodstype.class,
                    one = @One(select = "com.example.dao.GoodstypeDao.queryBytID"))
    })
    @Select("select * from goods")
    ArrayList<Goods> queryAll();

    @Delete("delete from goods where gdID = #{id}")
    int deleteByID(Integer id);

    @Select("select * from goods where gdID = #{id}")
    Goods findById(Integer id);


    @Update("UPDATE goods SET " +
            "tId = #{goods.tid}," +
            "gdCode = #{goods.gdcode}, " +
            "gdName = #{goods.gdname}," +
            "gdPrice = #{goods.gdprice}," +
            "gdQuantity = #{goods.gdquantity}, " +
            "gdCity = #{goods.gdcity}, " +
            "gdInfo = #{goods.gdinfo}, " +
            "gdHot =  #{goods.gdhot} " +
            "WHERE gdID =  #{goods.gdid}")
    int update(@Param("goods") Goods goods);


    @Insert("INSERT INTO goods" +
            "(tID,gdCode,gdName,gdQuantity,gdCity,gdInfo,gdAddTime)" +
            "VALUES(#{goods.tid},#{goods.gdcode},#{goods.gdname}" +
            ",#{goods.gdquantity},#{goods.gdcity},#{goods.gdinfo},now())")
    int insert(@Param("goods") Goods goods);
}
