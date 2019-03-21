package com.sy.springsecurity_demo;

import com.sy.springsecurity_demo.entity.Users;
import com.sy.springsecurity_demo.service.UsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringsecurityDemoApplicationTests {

    @Autowired
    UsersService service;

    @Test
    public void contextLoads() {
//        Users users =  new Users();
//        users.setEnable(1);
//        users.setPassWord("123");
//        users.setUserName("lwc");
//        users.setAuthority("admin");
//        service.sava(users);
    }

}
