package com.kuke.wuliu.pojo;

public class Fpartition {
    private Integer fpartitionId;

    private Integer fpartitionDepositoryid;

    private String fpartitionName;

    private String fpartitionNumber;

    private Float fpartitionMinweight;

    private Float fpartitonMaxweight;

    private Integer fpartitionSort;

    private Integer fpartitionState;

    private String fpartitionRemarks;

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

    public String getFpartitionNumber() {
        return fpartitionNumber;
    }

    public void setFpartitionNumber(String fpartitionNumber) {
        this.fpartitionNumber = fpartitionNumber == null ? null : fpartitionNumber.trim();
    }

    public Float getFpartitionMinweight() {
        return fpartitionMinweight;
    }

    public void setFpartitionMinweight(Float fpartitionMinweight) {
        this.fpartitionMinweight = fpartitionMinweight;
    }

    public Float getFpartitonMaxweight() {
        return fpartitonMaxweight;
    }

    public void setFpartitonMaxweight(Float fpartitonMaxweight) {
        this.fpartitonMaxweight = fpartitonMaxweight;
    }

    public Integer getFpartitionSort() {
        return fpartitionSort;
    }

    public void setFpartitionSort(Integer fpartitionSort) {
        this.fpartitionSort = fpartitionSort;
    }

    public Integer getFpartitionState() {
        return fpartitionState;
    }

    public void setFpartitionState(Integer fpartitionState) {
        this.fpartitionState = fpartitionState;
    }

    public String getFpartitionRemarks() {
        return fpartitionRemarks;
    }

    public void setFpartitionRemarks(String fpartitionRemarks) {
        this.fpartitionRemarks = fpartitionRemarks == null ? null : fpartitionRemarks.trim();
    }
}