package com.lrlz.springcloud.userservice.controller;

import com.lrlz.commons.response.BaseResult;
import com.lrlz.springcloud.userservice.domain.User;
import com.lrlz.springcloud.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lrlz 1290650611@qq.com
 * @cteate 2018/1/13
 */
@RestController
@RequestMapping("/user")
class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public BaseResult getById(@PathVariable("id") Integer id) {
        User user = new User();
        user.setId(id);
        user.setUserName("test");
        user.setPassword("123456");
        return BaseResult.success(user);
    }

    @PutMapping
    public BaseResult addUser(@RequestBody User user) {
        int id = userService.add(user);
        return BaseResult.success(1);
    }

    @PostMapping
    public BaseResult editUser(@RequestBody User user) {
        return BaseResult.success(userService.edit(user));
    }



}
