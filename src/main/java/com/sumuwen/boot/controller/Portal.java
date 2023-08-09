package com.sumuwen.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Portal {
    /* 登录界面 */
    @GetMapping(value = {"","/login"})
    public String login(){
        return "site/login";
    }

    /* 注册页面 */
    @GetMapping("/register")
    public String register(){
        return "site/register";
    }
}
