package cn.phuso.flp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * createtime:2019年09月18日 10:32
 * author: phusohoo
 */
@RestController
public class PhusoController {

    @GetMapping("/hello")
    public String hello(){

        return "I Love Flower";
    }

    @RequestMapping("/test")
    public String test(){
        return "Test.html";
    }
}
