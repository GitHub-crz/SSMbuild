package com.crz.controller;


import com.crz.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @Autowired
    @Qualifier("LoginServiceImpl")
    private LoginService loginService;

    @RequestMapping("/test")
    public String userlogin(Model model,String username,String pwd){
        if(loginService.verify(username)==pwd)return "redirect:/book/allBook";
        else return "test";
    }
}
