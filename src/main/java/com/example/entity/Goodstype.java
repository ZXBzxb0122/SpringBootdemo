package com.example.entity;

import java.io.Serializable;

/**
 * (Goodstype)实体类
 *
 * @author makejava
 * @since 2022-04-04 15:06:26
 */
public class Goodstype implements Serializable {
    private static final long serialVersionUID = -31891364512707435L;
    
    private Integer tid;
    
    private String tname;


    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

}

