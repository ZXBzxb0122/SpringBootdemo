package com.example.dao;

import com.example.entity.Adminuser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface AdminuserMapper {

    @Select("select * from adminuser where aduName = #{adminuser.aduname} AND aduPwd = #{adminuser.adupwd} ")
    public Adminuser geAdminUser(@Param("adminuser") Adminuser adminuser);
}
