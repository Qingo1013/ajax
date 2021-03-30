package cn.qqa.controller;


import cn.qqa.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@RestController
public class AjaxController  {
    @RequestMapping("/test")
    public String test(){
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:name->"+name);
        if("qqa".equals(name)){
            response.getWriter().print("true");
        }else {
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2(){
        List<User> list = new ArrayList<User>();

        list.add(new User("qqa",21,"男"));
        list.add(new User("xxx",21,"男"));
        list.add(new User("wxy",21,"female"));
        list.add(new User("xxxx",21,"女"));

        return list;
    }

    @RequestMapping("/a3")
    public String a3(String name,String pwd){
        String msg="";
        if(name!=null){
            //从数据库中查询
            if("admin".equals(name)){
                msg="OK";
            }else{
                msg="用户名有误！";
            }
        }
        if(pwd!=null){
            //从数据库中查询
            if("123456".equals(name)){
                msg="OK";
            }else{
                msg="密码有误！";
            }
        }
        return msg;
    }



}
