package com.kuke.wuliu.controller;

import com.kuke.wuliu.dao.DepositoryMapper;
import com.kuke.wuliu.pojo.Depository;
import com.kuke.wuliu.service.CrudServer;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DepositoryController {
    @Autowired
    CrudServer crudServer;
    @ResponseBody
    @GetMapping("/insert_depository")
    public String depository(@RequestParam("dep_name") String dep_name, @RequestParam("dep_address") String dep_address, @RequestParam("consignee_name") String consignee_name, @RequestParam("consignee_phone") String consignee_phone) {
        String result = crudServer.inserDepository(dep_name, dep_address, consignee_name, consignee_phone);
        return result;
    }

    @ResponseBody
    @GetMapping("/insert_fpartition")
    public String fpartition(@RequestParam("fpartition_Depid") Integer fpartition_Depid,
                             @RequestParam("fpartition_Name") String fpartition_Name,
                             @RequestParam("fpartition_Number") String fpartition_Number,
                             @RequestParam("fpartition_Minweight") Float fpartition_Minweight,
                             @RequestParam("fpartiton_Maxweight") Float fpartiton_Maxweight,
                             @RequestParam("fpartition_Remarks") String fpartition_Remarks,
                             @RequestParam("fpartition_Sort") Integer fpartition_Sort,
                             @RequestParam("fpartition_State") Integer fpartition_State){
        String result = crudServer.insertFpartition(fpartition_Depid, fpartition_Name, fpartition_Number, fpartition_Minweight, fpartiton_Maxweight, fpartition_Remarks, fpartition_Sort, fpartition_State);
        return result;
    }
}
