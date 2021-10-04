package com.example.tabler.getInLine.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController implements ErrorController {
        // Welcome page 설정이 되어 있어서 기본 index.html을 연결되고 있음.
    @GetMapping("/")
    public String root(){
        return "index";
    }

    @RequestMapping("/error")
    public String error(){
        return "error";
    }
}
