package com.greedystar.dubboprovider.dao;

import com.greedystar.apidubboprovider.entity.Role;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Author GreedyStar
 * Date   2020-6-1
 */
@Component
public class RoleDao {
    private List<Role> roles = new ArrayList<>();

    public RoleDao() {
        for (int i = 0; i < 10; i++) {
            roles.add(new Role(i, "ROLE_" + i));
        }
    }

    public List<Role> getAllRoles() {
        return roles;
    }

}
