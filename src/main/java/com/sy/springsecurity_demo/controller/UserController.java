package com.sy.springsecurity_demo.controller;

import com.sy.springsecurity_demo.entity.Users;
import com.sy.springsecurity_demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * @Description:
 * @Author: 刘炜程
 * @Date: 2019-03-13 9:30
 */
@SuppressWarnings("all")
@Controller
public class UserController {

    @Autowired
    UsersService service;

    @GetMapping("/login")
    public String index(Model model, String error){
        if (error!=null){
            if(error.equals("expired")){
                model.addAttribute("expired","你的账号已在其他地方登录");
            }
        }
        return "login";
    }

    @GetMapping("/index")
    public String indexPage(HttpSession session, @AuthenticationPrincipal UserDetails userDetails){
//        userDetails.getUsername();
//        session.setAttribute("user",service.findByUserName(userDetails.getUsername()));

        return  "index";
    }


    @GetMapping("/ex")
    public String ex(){return  "erro_authority";}

    @GetMapping("/i")
    @PreAuthorize("!hasAnyAuthority('admin','user')")
    public String i(){return  "index";}


}
