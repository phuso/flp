package cn.phuso.flp.controller;

import cn.phuso.flp.pojo.User;
import cn.phuso.flp.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * createtime:2019年09月18日 12:02
 * author: phusohoo
 */
@RestController
public class UserController {
    @Autowired
    private UserSerivce userSerivce;

    @PostMapping("/saveOrUpdate")
    public boolean saveOrUpdate(User user){

        return userSerivce.saveOrUpdate(user);
    }
}
