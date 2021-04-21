package com.kuke.wuliu.pojo;

public class Shelves {
    private Integer shelvesId;

    private Integer shelvesFpartitionid;

    private String shelvesName;

    private String shelvesRemarks;

    private Integer shelvesSort;

    private Integer shelvesState;

    private Integer shelvesStorage;

    private String shelvesSize;

    public Integer getShelvesId() {
        return shelvesId;
    }

    public void setShelvesId(Integer shelvesId) {
        this.shelvesId = shelvesId;
    }

    public Integer getShelvesFpartitionid() {
        return shelvesFpartitionid;
    }

    public void setShelvesFpartitionid(Integer shelvesFpartitionid) {
        this.shelvesFpartitionid = shelvesFpartitionid;
    }

    public String getShelvesName() {
        return shelvesName;
    }

    public void setShelvesName(String shelvesName) {
        this.shelvesName = shelvesName == null ? null : shelvesName.trim();
    }

    public String getShelvesRemarks() {
        return shelvesRemarks;
    }

    public void setShelvesRemarks(String shelvesRemarks) {
        this.shelvesRemarks = shelvesRemarks == null ? null : shelvesRemarks.trim();
    }

    public Integer getShelvesSort() {
        return shelvesSort;
    }

    public void setShelvesSort(Integer shelvesSort) {
        this.shelvesSort = shelvesSort;
    }

    public Integer getShelvesState() {
        return shelvesState;
    }

    public void setShelvesState(Integer shelvesState) {
        this.shelvesState = shelvesState;
    }

    public Integer getShelvesStorage() {
        return shelvesStorage;
    }

    public void setShelvesStorage(Integer shelvesStorage) {
        this.shelvesStorage = shelvesStorage;
    }

    public String getShelvesSize() {
        return shelvesSize;
    }

    public void setShelvesSize(String shelvesSize) {
        this.shelvesSize = shelvesSize == null ? null : shelvesSize.trim();
    }
}