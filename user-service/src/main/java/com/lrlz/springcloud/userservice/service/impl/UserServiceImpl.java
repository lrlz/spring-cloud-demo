package com.lrlz.springcloud.userservice.service.impl;

import com.lrlz.springcloud.userservice.dao.UserMapper;
import com.lrlz.springcloud.userservice.domain.User;
import com.lrlz.springcloud.userservice.domain.UserCriteria;
import com.lrlz.springcloud.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserServiceImpl
 * @author lrlz 1290650611@qq.com
 * @cteate 2018/1/13
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int add(User user) {
        userMapper.insert(user);
        return user.getId();
    }

    @Override
    public void delete(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int edit(User user) {
        userMapper.insertSelective(user);
        return user.getId();
    }

    @Override
    public List<User> list() {
        UserCriteria criteria = new UserCriteria();
        return userMapper.selectByExample(criteria);
    }
}
