package com.hsrd.ems.controller;

import com.hsrd.ems.entity.User;
import com.hsrd.ems.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController{
    @Autowired
    private UserService userService;
    @PostMapping("login")
    public String login(String username, String password, HttpSession session){
       User user = userService.login(username,password);
       if (user!=null){
           session.setAttribute("user",user);
           return "redirect:/emp/findAll";
       }else {
           return "redirect:/login.jsp";
       }
    }
    @PostMapping("regist")
    public String regist(User user){
        System.out.println(user);
        userService.save(user);

        return "redirect:/login.jsp";
    }
}
