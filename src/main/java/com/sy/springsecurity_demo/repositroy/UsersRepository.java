package com.sy.springsecurity_demo.repositroy;

import com.sy.springsecurity_demo.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description: 用户
 * @Author: 刘炜程
 * @Date: 2019-03-16 11:35
 */
@SuppressWarnings("all")
public interface UsersRepository extends JpaRepository<Users,Integer> {

    public Users findFirstByUserName (String userName);

}
