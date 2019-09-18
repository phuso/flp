package cn.phuso.flp.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * createtime:2019年09月18日 10:42
 * author: phusohoo
 */
@Data
@Entity
public class User {

    @Id
    private String id;
    private String loginName;
    private String passWord;
    private String name;
    private int age;
    private  String address;
}
