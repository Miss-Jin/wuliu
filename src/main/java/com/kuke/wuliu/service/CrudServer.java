package com.kuke.wuliu.service;

import com.kuke.wuliu.dao.DepositoryMapper;
import com.kuke.wuliu.dao.FpartitionMapper;
import com.kuke.wuliu.pojo.Depository;
import com.kuke.wuliu.pojo.Fpartition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudServer {
    @Autowired
    DepositoryMapper depositoryMapper;
    @Autowired
    FpartitionMapper fpartitionMapper;
    //一.Depository（仓库对象CRUD）
    //1.1查询所有仓库记录，封装成List
    public List<Depository> selectAllDepository(){
        List<Depository> depositories = depositoryMapper.selectAll();
        return depositories;
    }
    //1.2添加Depository(1:添加成功 2:添加失败)
    public String inserDepository(String dep_name,String dep_address,String consignee_name,String consignee_phone){
        Depository dep = new Depository();
        dep.setDepositoryName(dep_name);
        dep.setDepositoryAddress(dep_address);
        dep.setDepositoryReceivername(consignee_name);
        dep.setDepositoryPhone(consignee_phone);
        int result = depositoryMapper.insert(dep);
        if (result != 0){
            return "添加成功！";
        }
        else {
            return "添加失败！";
        }
    }

    public String insertFpartition(Integer fpartition_Depid,
                                   String fpartition_Name,
                                   String fpartition_Number,
                                   Float fpartition_Minweight,
                                   Float fpartiton_Maxweight,
                                   String fpartition_Remarks,
                                   Integer fpartition_Sort,
                                   Integer fpartition_State){
        Fpartition fpartition = new Fpartition();
        fpartition.setFpartitionDepositoryid(fpartition_Depid);
        fpartition.setFpartitionName(fpartition_Name);
        fpartition.setFpartitionNumber(fpartition_Number);
        fpartition.setFpartitionMinweight(fpartition_Minweight);
        fpartition.setFpartitonMaxweight(fpartiton_Maxweight);
        fpartition.setFpartitionRemarks(fpartition_Remarks);
        fpartition.setFpartitionSort(fpartition_Sort);
        fpartition.setFpartitionState(fpartition_State);
        int result = fpartitionMapper.insert(fpartition);
        if (result != 0){
            return "添加成功！";
        }
        else {
            return "添加失败！";
        }
    }
}
