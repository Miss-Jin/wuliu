package com.kuke.wuliu.pojo;

public class Depository {
    private Integer depositoryId;

    private String depositoryName;

    private String depositoryAddress;

    private String depositoryReceivername;

    private String depositoryPhone;

    public Integer getDepositoryId() {
        return depositoryId;
    }

    public void setDepositoryId(Integer depositoryId) {
        this.depositoryId = depositoryId;
    }

    public String getDepositoryName() {
        return depositoryName;
    }

    public void setDepositoryName(String depositoryName) {
        this.depositoryName = depositoryName == null ? null : depositoryName.trim();
    }

    public String getDepositoryAddress() {
        return depositoryAddress;
    }

    public void setDepositoryAddress(String depositoryAddress) {
        this.depositoryAddress = depositoryAddress == null ? null : depositoryAddress.trim();
    }

    public String getDepositoryReceivername() {
        return depositoryReceivername;
    }

    public void setDepositoryReceivername(String depositoryReceivername) {
        this.depositoryReceivername = depositoryReceivername == null ? null : depositoryReceivername.trim();
    }

    public String getDepositoryPhone() {
        return depositoryPhone;
    }

    public void setDepositoryPhone(String depositoryPhone) {
        this.depositoryPhone = depositoryPhone == null ? null : depositoryPhone.trim();
    }

    @Override
    public String toString() {
        return "Depository{" +
                "depositoryId=" + depositoryId +
                ", depositoryName='" + depositoryName + '\'' +
                ", depositoryAddress='" + depositoryAddress + '\'' +
                ", depositoryReceivername='" + depositoryReceivername + '\'' +
                ", depositoryPhone='" + depositoryPhone + '\'' +
                '}';
    }
}