package com.sy.springsecurity_demo.service;

import com.sy.springsecurity_demo.entity.Users;
import com.sy.springsecurity_demo.repositroy.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: 刘炜程
 * @Date: 2019-03-16 11:36
 */
@SuppressWarnings("all")
@Service
public class UsersService {

    @Autowired
    UsersRepository repository;

    /**
     * 新增用户
     * @param users
     * @return
     */
    public Users sava(Users users){
        return  repository.save(users);
    }

    /**
     * 根据用户名查找账号
     * @param userName
     * @return
     */
    public Users findByUserName(String userName){return  repository.findFirstByUserName(userName);}
}
