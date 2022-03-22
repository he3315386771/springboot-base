package com.kyy.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("hello")
    @ResponseBody
    public String sayHello(){
        logger.debug("123");
        return "Hello springboot 哈喽";
    }

    @RequestMapping("index")
    public String index(Model model){
        model.addAttribute("msg","freemarker hello freemarker 哈喽");
        return "index";
    }

    @RequestMapping("index2")
    public String index2(Model model){
        model.addAttribute("msg","thymeleaf hello freemarker 哈喽");
        return "index2.html";
    }
}
