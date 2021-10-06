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

    @RequestMapping("/totest")
    public String touserlogin(){
        return "test";
    }

    @RequestMapping("/test")
    public String userlogin(Model model,String username,String pwd){
        System.out.println(username+" "+pwd+"  "+loginService.verify(username));
        if(loginService.verify(username).equals(pwd)){
            System.out.println("跳转成功");
            return "redirect:/book/allBook";
        }
        else return "fail";
    }
}
