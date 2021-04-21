package com.kuke.wuliu.service;

import com.kuke.wuliu.dao.DepositoryMapper;
import com.kuke.wuliu.pojo.Depository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CrudServer {
    @Autowired
    DepositoryMapper depositoryMapper;
    //一.Depository（仓库对象CRUD）
    //添加Depository(1:添加成功 2:添加失败)
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
}
