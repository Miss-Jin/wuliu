package com.kuke.wuliu.controller;

import com.kuke.wuliu.dao.DepositoryMapper;
import com.kuke.wuliu.pojo.Depository;
import com.kuke.wuliu.pojo.Fpartition;
import com.kuke.wuliu.service.CrudServer;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class DepositoryController {
    @Autowired
    CrudServer crudServer;
    @ResponseBody
    @GetMapping("/insert_depository")
    public String depository(@RequestParam("dep_name") String dep_name, @RequestParam("dep_address") String dep_address, @RequestParam("consignee_name") String consignee_name, @RequestParam("consignee_phone") String consignee_phone) {
        String result = crudServer.inserDepository(dep_name, dep_address, consignee_name, consignee_name);
        return result;
    }

    @ResponseBody
    @GetMapping("/insert_shelves")
    public String shelves(@RequestParam("shelves_fpartition") Integer fid,
                          @RequestParam("shelves_name") String s_name,
                          @RequestParam("shelves_remark") String s_remart,
                          @RequestParam("shelves_storage") Integer s_storage,
                          @RequestParam("shelves_state") Integer s_state,
                          @RequestParam("shelves_size") String s_size,
                          @RequestParam("shelves_sort") Integer s_sort){
        String result = crudServer.insertShelves(fid, s_name, s_remart, s_sort, s_state, s_storage, s_size);
        return result;
    }


    @ResponseBody
    @GetMapping("/selectFpartitionByDep")
    public List<Fpartition> selectFpartitionByDep(@RequestParam("dep_name") String dep_name){
        List<Fpartition> fpartitions = crudServer.selectAllFpartitionByDepName(dep_name);
        System.out.println("1111");
        return fpartitions;
    }


}
