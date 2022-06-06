package com.example.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Orderdetail)实体类
 *
 * @author makejava
 * @since 2022-05-23 16:34:44
 */
public class Orderdetail implements Serializable {
    private static final long serialVersionUID = 808021786445692257L;
    
    private Integer odid;
    
    private Integer oid;
    
    private Integer gdid;
    
    private Integer odnum;
    
    private String devalution;
    
    private Date odtime;


    public Integer getOdid() {
        return odid;
    }

    public void setOdid(Integer odid) {
        this.odid = odid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getGdid() {
        return gdid;
    }

    public void setGdid(Integer gdid) {
        this.gdid = gdid;
    }

    public Integer getOdnum() {
        return odnum;
    }

    public void setOdnum(Integer odnum) {
        this.odnum = odnum;
    }

    public String getDevalution() {
        return devalution;
    }

    public void setDevalution(String devalution) {
        this.devalution = devalution;
    }

    public Date getOdtime() {
        return odtime;
    }

    public void setOdtime(Date odtime) {
        this.odtime = odtime;
    }

}

