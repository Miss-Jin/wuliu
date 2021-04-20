package com.kuke.wuliu.pojo;

public class Fpartition {
    private Integer fpartitionId;

    private Integer fpartitionDepositoryid;

    private String fpartitionName;

    public Integer getFpartitionId() {
        return fpartitionId;
    }

    public void setFpartitionId(Integer fpartitionId) {
        this.fpartitionId = fpartitionId;
    }

    public Integer getFpartitionDepositoryid() {
        return fpartitionDepositoryid;
    }

    public void setFpartitionDepositoryid(Integer fpartitionDepositoryid) {
        this.fpartitionDepositoryid = fpartitionDepositoryid;
    }

    public String getFpartitionName() {
        return fpartitionName;
    }

    public void setFpartitionName(String fpartitionName) {
        this.fpartitionName = fpartitionName == null ? null : fpartitionName.trim();
    }
}