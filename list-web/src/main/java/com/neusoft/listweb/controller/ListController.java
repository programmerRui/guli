package com.neusoft.listweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListController {
    @RequestMapping("index.do")
    public String index(){
        return "index";
    }
    @RequestMapping("list.do")
    public String list(){
        return "list";
    }
}
