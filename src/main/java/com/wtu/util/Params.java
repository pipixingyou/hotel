package com.wtu.util;

public class Params {
    private int pageNum; //当前页
    private int pageSize=5;//当前页数


    //其他条件
    private String floor; //楼层
    private String rname; //房间类型
    private String rid;

    //用户里面的
    private String uname;
    private String idcard;
    private String uphone;

    public Params() {
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
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

    @Override
    public String toString() {
        return "Params{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", floor='" + floor + '\'' +
                ", rname='" + rname + '\'' +
                ", rid='" + rid + '\'' +
                ", uname='" + uname + '\'' +
                ", idcard='" + idcard + '\'' +
                ", uphone='" + uphone + '\'' +
                '}';
    }
}
