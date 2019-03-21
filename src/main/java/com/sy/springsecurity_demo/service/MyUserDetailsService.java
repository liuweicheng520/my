package com.sy.springsecurity_demo.service;

import com.sy.springsecurity_demo.entity.Users;
import com.sy.springsecurity_demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: 刘炜程
 * @Date: 2019-03-16 11:25
 */
@SuppressWarnings("all")
@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UsersService service;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        System.out.println("名字"+userName);
        Users users = service.findByUserName(userName);

        System.out.println(users);
        if(users == null){
            throw new UsernameNotFoundException("没有此用户名");
        }else {
                return new User(userName, passwordEncoder.encode(users.getPassWord()), AuthorityUtils.commaSeparatedStringToAuthorityList(users.getAuthority()));
        }
    }
}
