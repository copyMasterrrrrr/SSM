package com.lin.controller.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getRequestURI().contains("goLogin")){
            System.out.println("--------------goLogin");
            return true;
        }
        if (request.getRequestURI().contains("LOGIN")){
            System.out.println("--------------LOGIN");
            return true;
        }
        if (request.getAttribute("userName")!=null&&request.getAttribute("pwd")!=null){
            System.out.println("---------------getSession null");
            return true;
        }
        request.getRequestDispatcher("/WEB-INF/jsp/LOGIN.jsp").forward(request,response);
        return false;
    }
}
