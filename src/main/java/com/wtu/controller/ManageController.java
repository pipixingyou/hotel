package com.wtu.controller;

import com.wtu.entity.Manage;
import com.wtu.service.ManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("/manager")
public class ManageController {

    @Autowired
    private ManageService manageService;

    @RequestMapping("/login")
    public String login(){

        return "managelogin";
    }

    //登录
    @RequestMapping("/dologin")
    public String dolgin(String mcode, String password, HttpSession session, HttpServletRequest request){
        Manage manage = manageService.MangeLogin(mcode, password);
        if(manage!=null){
            session.setAttribute("manage",manage);
            return "redirect:/manager/main";
        }else {
            request.setAttribute("error","用户名或密码错误");
            return "managelogin";
        }
    }

    //登陆跳转
    @RequestMapping("/main")
    public String main(HttpSession session,HttpServletRequest request){
       if( session.getAttribute("manage")==null){
           request.setAttribute("error","请输入用户名和密码");
           return "managelogin";
       }
        return "manage/main";
    }

    //退出登录
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.removeAttribute("manage");

        Date date = new Date();

        return "managelogin";
    }


}
