package com.kuke.wuliu.controller;

import com.kuke.wuliu.pojo.Depository;
import com.kuke.wuliu.service.CrudServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//点击左侧列表的相关请求
@Controller
public class LeftController {
    @Autowired
    CrudServer crudServer;
    @GetMapping("/partition_info_submit")
    public ModelAndView showPartitionSubmit(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("partition_info_submit");
        List<Depository> depositories = crudServer.selectAllDepository();
        mav.addObject("list_dep",depositories);
        System.out.println(depositories);
        return mav;
    }

    @GetMapping("/shelves_info_submit")
    public ModelAndView showShelvesSubmit(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("shelves_info_submit");
        List<Depository> depositories = crudServer.selectAllDepository();
        mav.addObject("list_dep",depositories);
        System.out.println(depositories);
        return mav;
    }

}
