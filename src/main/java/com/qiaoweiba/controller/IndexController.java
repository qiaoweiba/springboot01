package com.qiaoweiba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Administrator
 * @data 十月 27 2017 15:43.
 */
//@RestController
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index() {
        System.out.println("index");
        return "index";
//        return "redirect:/index.jsp";
    }

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello");
        return "hello";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        System.out.println("welcome");
        return "welcome";
    }
}
