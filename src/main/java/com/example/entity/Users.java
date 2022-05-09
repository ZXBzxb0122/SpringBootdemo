package com.example.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Users)实体类
 *
 * @author makejava
 * @since 2022-05-02 17:54:41
 */
public class Users implements Serializable {
    private static final long serialVersionUID = 160665958239101880L;
    
    private Integer uid;
    
    private String uname;
    
    private String upwd;
    
    private String usex;
    
    private Date ubirth;
    
    private String ucity;
    
    private String uphone;
    
    private String uemail;
    
    private String uqq;
    
    private Integer ucredit;
    
    private Date uregtime;
    
    private String uimage;


    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public Date getUbirth() {
        return ubirth;
    }

    public void setUbirth(Date ubirth) {
        this.ubirth = ubirth;
    }

    public String getUcity() {
        return ucity;
    }

    public void setUcity(String ucity) {
        this.ucity = ucity;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUqq() {
        return uqq;
    }

    public void setUqq(String uqq) {
        this.uqq = uqq;
    }

    public Integer getUcredit() {
        return ucredit;
    }

    public void setUcredit(Integer ucredit) {
        this.ucredit = ucredit;
    }

    public Date getUregtime() {
        return uregtime;
    }

    public void setUregtime(Date uregtime) {
        this.uregtime = uregtime;
    }

    public String getUimage() {
        return uimage;
    }

    public void setUimage(String uimage) {
        this.uimage = uimage;
    }

}

