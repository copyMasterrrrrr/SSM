package com.lin.controller.ajax;

import com.lin.pojo.ajax.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TextAjax {

    @RequestMapping("/ajax")
    public void test1(String username, HttpServletResponse response)throws IOException {
        System.out.println("username===>"+username);
        if ("lin".equals(username)){
            response.getWriter().print("true");
        }else{
            response.getWriter().print("false");
        }

    }


    @RequestMapping("/ajax2")
    public List test2(){
        List<User> list=new ArrayList<User>();
        list.add(new User("zhangsan",13,"北京"));
        list.add(new User("lisi",16,"上海"));
        list.add(new User("wangwu",10,"杭州"));
        return list;
    }


    @RequestMapping("/login")
    public String test3(String name,String pwd){
        String msg = "";
        if (name!=null){
            if ("admin".equals(name)){
                msg="true";
            }else{
                msg="false";
            }
        }
        if (pwd!=null){
            if ("pwd".equals(pwd)){
                msg="true";
            }else{
                msg="false";
            }
        }

        return msg;
    }



}
