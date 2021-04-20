package com.kuke.wuliu.pojo;

public class Shelves {
    private Integer shelvesId;

    private Integer shelvesSpartitionid;

    private String shelvesName;

    public Integer getShelvesId() {
        return shelvesId;
    }

    public void setShelvesId(Integer shelvesId) {
        this.shelvesId = shelvesId;
    }

    public Integer getShelvesSpartitionid() {
        return shelvesSpartitionid;
    }

    public void setShelvesSpartitionid(Integer shelvesSpartitionid) {
        this.shelvesSpartitionid = shelvesSpartitionid;
    }

    public String getShelvesName() {
        return shelvesName;
    }

    public void setShelvesName(String shelvesName) {
        this.shelvesName = shelvesName == null ? null : shelvesName.trim();
    }
}