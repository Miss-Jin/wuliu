package com.kuke.wuliu.controller;

import com.kuke.wuliu.dao.DepositoryMapper;
import com.kuke.wuliu.pojo.Depository;
import com.kuke.wuliu.utils.LoginCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
    @Autowired
    LoginCheck loginCheck;
    //登录验证
    @PostMapping("/loginCheck")
    public ModelAndView loginCheck(@RequestParam("username") String username, @RequestParam("password") String password){
        ModelAndView mav = new ModelAndView();
        boolean result = loginCheck.loginCheck(username, password);
        if(result){
            mav.setViewName("main");
        }
        else{
            mav.setViewName("index");
            mav.addObject("errorInfo","用户名或密码错误！");
        }
        return mav;
}
}
