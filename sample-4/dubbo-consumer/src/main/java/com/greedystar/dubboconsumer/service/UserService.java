package com.greedystar.dubboconsumer.service;

import com.greedystar.apidubboprovider.entity.Role;
import com.greedystar.apidubboprovider.service.IRoleService;
import com.greedystar.dubboconsumer.entity.User;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * Author GreedyStar
 * Date   2020-6-1
 */
@Service
public class UserService {
    @Reference
    private IRoleService roleService;

    public List<User> getAllUsers() {
        User user = new User(1, "Alvin", "13663348294");
        user.setRoles(roleService.getAllRoles());
        List<User> users = Collections.singletonList(user);
        return users;
    }

}
