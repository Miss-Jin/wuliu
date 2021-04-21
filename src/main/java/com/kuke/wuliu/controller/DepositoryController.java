package com.kuke.wuliu.controller;

import com.kuke.wuliu.dao.DepositoryMapper;
import com.kuke.wuliu.pojo.Depository;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DepositoryController {
@Autowired
    DepositoryMapper depositoryMapper;
    @ResponseBody
    @GetMapping("/insert_depository")
    public Object depository(@RequestParam ("dep_address") String dep_address, @RequestParam("consignee_name") String consignee_name, @RequestParam("consignee_phone") String consignee_phone) {
Depository dep=new Depository();
dep.setDepositoryAddress(dep_address);
dep.setDepositoryName("beijing");
dep.setDepositoryPhone(consignee_phone);
dep.setDepositoryReceivername(consignee_name);
        depositoryMapper.insert(dep);
        return null;
    }
}
