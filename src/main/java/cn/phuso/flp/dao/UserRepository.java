package cn.phuso.flp.dao;

import cn.phuso.flp.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * createtime:2019年09月18日 11:48
 * author: phusohoo
 */
public interface UserRepository extends JpaRepository<User,String> {
}
