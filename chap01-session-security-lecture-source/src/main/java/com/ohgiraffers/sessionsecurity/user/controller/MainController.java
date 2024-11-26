package com.ohgiraffers.sessionsecurity.user.controller;

import com.ohgiraffers.sessionsecurity.user.model.dto.SignupDTO;
import com.ohgiraffers.sessionsecurity.user.model.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {


    @GetMapping("/")
    public String mainPage(){
        return "main";
    }

    /* comment. 관리자만 들어갈 수 있는지 TEST*/
    @GetMapping("/admin/page")
    public ModelAndView adminPage(ModelAndView mv){
        mv.setViewName("admin/admin");
        return mv;
    }

    // 유저만 들어갈 수 있는지 TEST
    @GetMapping("/user/page")
    public ModelAndView userPage(ModelAndView mv){
        mv.setViewName("user/user");
        return mv;
    }

}
