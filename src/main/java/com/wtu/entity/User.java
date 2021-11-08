package com.wtu.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {
    private Integer uid; //编号
    private String uname; //入住客户姓名
    private String idcard; //身份证号码
    private String uphone; //电话号码
    private String usex; //性别
    private Integer rid; //入住房间号
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fromtime; //入住时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date totime; //退房时间
    private Integer ustatus; //入住状态 1入住中0已经离开

    public User() {
    }

    public User(String uname, String idcard, String uphone, String usex, Integer rid, Date fromtime, Date totime, Integer ustatus) {
        this.uname = uname;
        this.idcard = idcard;
        this.uphone = uphone;
        this.usex = usex;
        this.rid = rid;
        this.fromtime = fromtime;
        this.totime = totime;
        this.ustatus = ustatus;
    }

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

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getUphone() {
        return uphone;
    }

    public void setUphone(String uphone) {
        this.uphone = uphone;
    }

    public String getUsex() {
        return usex;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Date getFromtime() {
        return fromtime;
    }

    public void setFromtime(Date fromtime) {
        this.fromtime = fromtime;
    }

    public Date getTotime() {
        return totime;
    }

    public void setTotime(Date totime) {
        this.totime = totime;
    }

    public Integer getUstatus() {
        return ustatus;
    }

    public void setUstatus(Integer ustatus) {
        this.ustatus = ustatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", idcard='" + idcard + '\'' +
                ", uphone='" + uphone + '\'' +
                ", usex='" + usex + '\'' +
                ", rid=" + rid +
                ", fromtime=" + fromtime +
                ", totime=" + totime +
                ", ustatus=" + ustatus +
                '}';
    }
}
