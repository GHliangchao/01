package com.td.pojo;

import java.util.Date;

public class Log {

    private Integer id;
    private String name;
    private String passwd;
    private String plan_desc;
    private Date date;
    private String state;

    public Log(Integer id, String name, String passwd, String plan_desc, Date date, String state) {
        this.id = id;
        this.name = name;
        this.passwd = passwd;
        this.plan_desc = plan_desc;
        this.date = date;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getPlan_desc() {
        return plan_desc;
    }

    public void setPlan_desc(String plan_desc) {
        this.plan_desc = plan_desc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
