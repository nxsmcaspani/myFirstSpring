package com.wildcodeschool.myfirstspring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DoctorController {
    @GetMapping("/doctor/1")
    @ResponseBody
    public String doctor1() {
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("hartnell");
//        return mav;
        return "William Hartnell";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String doctor10() {
        return "David Tennant";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String doctor13() {
        return "Jodie Whittaker";
    }
}