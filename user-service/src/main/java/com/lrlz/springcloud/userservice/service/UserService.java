package com.lrlz.springcloud.userservice.service;


import com.lrlz.springcloud.userservice.domain.User;

import java.util.List;

/**
 * UserService
 * @author lrlz 1290650611@qq.com
 * @cteate 2018/1/13
 */
public interface UserService {

    User getById(Integer id);

    int add(User user);

    void delete(Integer id);

    int edit(User user);

    List<User> list();
}
