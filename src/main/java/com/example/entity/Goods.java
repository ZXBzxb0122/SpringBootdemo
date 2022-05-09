package com.example.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * (Goods)实体类
 *
 * @author makejava
 * @since 2022-03-28 16:09:15
 */
@ApiModel("商品实体类")
public class Goods implements Serializable {
    private static final long serialVersionUID = -82400272029970484L;

    @ApiModelProperty("商品ID")
    private Integer gdid;
    @ApiModelProperty("商品类别ID")
    private Integer tid;

    private String gdcode;
    @ApiModelProperty("商品名")
    
    private String gdname;
    
    private String gdprice;
    
    private Integer gdquantity;
    
    private Integer gdsaleqty;
    
    private String gdcity;
    
    private String gdinfo;
    
    private Date gdaddtime;
    
    private Integer gdhot;
    
    private String gdimage;

    private Goodstype goodstype;

    public Goodstype getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(Goodstype goodstype) {
        this.goodstype = goodstype;
    }

    public Integer getGdid() {
        return gdid;
    }

    public void setGdid(Integer gdid) {
        this.gdid = gdid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getGdcode() {
        return gdcode;
    }

    public void setGdcode(String gdcode) {
        this.gdcode = gdcode;
    }

    public String getGdname() {
        return gdname;
    }

    public void setGdname(String gdname) {
        this.gdname = gdname;
    }

    public String getGdprice() {
        return gdprice;
    }

    public void setGdprice(String gdprice) {
        this.gdprice = gdprice;
    }

    public Integer getGdquantity() {
        return gdquantity;
    }

    public void setGdquantity(Integer gdquantity) {
        this.gdquantity = gdquantity;
    }

    public Integer getGdsaleqty() {
        return gdsaleqty;
    }

    public void setGdsaleqty(Integer gdsaleqty) {
        this.gdsaleqty = gdsaleqty;
    }

    public String getGdcity() {
        return gdcity;
    }

    public void setGdcity(String gdcity) {
        this.gdcity = gdcity;
    }

    public String getGdinfo() {
        return gdinfo;
    }

    public void setGdinfo(String gdinfo) {
        this.gdinfo = gdinfo;
    }

    public Date getGdaddtime() {
        return gdaddtime;
    }

    public void setGdaddtime(Date gdaddtime) {
        this.gdaddtime = gdaddtime;
    }

    public Integer getGdhot() {
        return gdhot;
    }

    public void setGdhot(Integer gdhot) {
        this.gdhot = gdhot;
    }

    public String getGdimage() {
        return gdimage;
    }

    public void setGdimage(String gdimage) {
        this.gdimage = gdimage;
    }

}

