package com.kuke.wuliu.service;

import com.kuke.wuliu.dao.DepositoryMapper;
import com.kuke.wuliu.dao.FpartitionMapper;
import com.kuke.wuliu.dao.ShelvesMapper;
import com.kuke.wuliu.pojo.Depository;
import com.kuke.wuliu.pojo.Fpartition;
import com.kuke.wuliu.pojo.Shelves;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudServer {
    @Autowired
    DepositoryMapper depositoryMapper;
    @Autowired
    FpartitionMapper fpartitionMapper;
    @Autowired
    ShelvesMapper shelvesMapper;
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

    public String insertShelves(Integer s_fid, String s_name, String s_remark, Integer s_sort,Integer s_state,Integer s_storage,String s_size){
        Shelves shelves = new Shelves();
        shelves.setShelvesFpartitionid(s_fid);
        shelves.setShelvesName(s_name);
        shelves.setShelvesRemarks(s_remark);
        shelves.setShelvesSort(s_sort);
        shelves.setShelvesState(s_state);
        shelves.setShelvesStorage(s_storage);
        shelves.setShelvesSize(s_size);
        int result = shelvesMapper.insert(shelves);
        if (result != 0){
            return "添加成功！";
        }
        else {
            return "添加失败！";
        }
    }

    //根据dep_name查所有分区记录
    public List<Fpartition> selectAllFpartitionByDepName(String dep_name){
        Depository depository = depositoryMapper.selectByDepositoryName(dep_name);
        List<Fpartition> fpartitions = fpartitionMapper.selectByDepId(depository.getDepositoryId());
        return fpartitions;
    }

}
