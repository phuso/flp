package cn.phuso.flp.service;

import cn.phuso.flp.dao.UserRepository;
import cn.phuso.flp.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * createtime:2019年09月18日 11:51
 * author: phusohoo
 */
@Service
public class UserSerivce {
    @Autowired
    private UserRepository userRepository;

    public boolean saveOrUpdate(User user){
        userRepository.save(user);
        return true;
    }
}
