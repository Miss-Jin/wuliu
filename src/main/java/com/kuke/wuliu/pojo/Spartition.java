package com.kuke.wuliu.pojo;

public class Spartition {
    private Integer spartitionId;

    private Integer spartitionFpartitionid;

    private String spartitionName;

    public Integer getSpartitionId() {
        return spartitionId;
    }

    public void setSpartitionId(Integer spartitionId) {
        this.spartitionId = spartitionId;
    }

    public Integer getSpartitionFpartitionid() {
        return spartitionFpartitionid;
    }

    public void setSpartitionFpartitionid(Integer spartitionFpartitionid) {
        this.spartitionFpartitionid = spartitionFpartitionid;
    }

    public String getSpartitionName() {
        return spartitionName;
    }

    public void setSpartitionName(String spartitionName) {
        this.spartitionName = spartitionName == null ? null : spartitionName.trim();
    }
}