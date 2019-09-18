package cn.phuso.flp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * createtime:2019年09月18日 14:26
 * author: phusohoo
 */
@Controller
public class TestController {

    @RequestMapping("/hi")
    public String hello(){
        return "pages/Test.html";
    }
}
