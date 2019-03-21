package com.sy.springsecurity_demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @Description:
 * @Author: 刘炜程
 * @Date: 2019-03-16 11:28
 */
@SuppressWarnings("all")
@Entity
@Data
public class Users {
    @Id
    @GeneratedValue
    private Integer id;
    // 账号
    private String userName;
    // 密码
    private String passWord;
    // 是否启用
    private Integer enable;
    // 权限
    private String authority;

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", enable=" + enable +
                ", authority='" + authority + '\'' +
                '}';
    }
}
