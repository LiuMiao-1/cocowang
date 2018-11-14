package com.cocowang.service.controller;

import com.cocowang.service.model.BannerModel;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@EnableAutoConfiguration
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/index")
    public String Index(){
        return "index";
    }

}
