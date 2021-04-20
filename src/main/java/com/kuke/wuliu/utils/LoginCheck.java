package com.kuke.wuliu.utils;

import org.springframework.stereotype.Component;

@Component
public class LoginCheck {
    //登录验证，成功true,失败false
    public boolean loginCheck(String username,String password){
        if(username.equals("root") && password.equals("root"))
        {
            return true;
        }
        else{
            return false;
        }
    }
}
