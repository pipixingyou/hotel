package com.wtu.entity;

public class RoomType {
    private Integer typeid; //房间类型号
    private Integer rtotal; //房间总数
    private String rname; //房间名
    private Double price; //房间每日单价
    private Integer rnums; //剩余房间数

    public RoomType() {
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getRtotal() {
        return rtotal;
    }

    public void setRtotal(Integer rtotal) {
        this.rtotal = rtotal;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getRnums() {
        return rnums;
    }

    public void setRnums(Integer rnums) {
        this.rnums = rnums;
    }
}
