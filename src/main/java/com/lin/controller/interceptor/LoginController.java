package com.lin.controller.interceptor;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping("/goLogin")
    public String goLogin(){
        return "LOGIN";
    }




    @RequestMapping("/LOGIN")
    public String login(HttpSession session,String userName,String pwd){
        session.setAttribute("userName",userName);
        session.setAttribute("pwd",pwd);
        return "AllBook";
    }

}
