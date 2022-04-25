package com.example.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Adminuser)实体类
 *
 * @author makejava
 * @since 2022-03-07 18:09:24
 */
public class Adminuser implements Serializable {
    private static final long serialVersionUID = -33316749066898687L;
    
    private Integer aduid;
    
    private String aduname;
    
    private String adupwd;
    
    private Date adlogintime;


    public Integer getAduid() {
        return aduid;
    }

    public void setAduid(Integer aduid) {
        this.aduid = aduid;
    }

    public String getAduname() {
        return aduname;
    }

    public void setAduname(String aduname) {
        this.aduname = aduname;
    }

    public String getAdupwd() {
        return adupwd;
    }

    public void setAdupwd(String adupwd) {
        this.adupwd = adupwd;
    }

    public Date getAdlogintime() {
        return adlogintime;
    }

    public void setAdlogintime(Date adlogintime) {
        this.adlogintime = adlogintime;
    }

}

