package com.greedystar.dubboconsumer.web;

import com.greedystar.dubboconsumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author GreedyStar
 * Date   2020-6-1
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public Object getAllUsers() {
        return userService.getAllUsers();
    }

}
