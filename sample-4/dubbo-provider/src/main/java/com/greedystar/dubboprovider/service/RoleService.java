package com.greedystar.dubboprovider.service;

import com.greedystar.apidubboprovider.entity.Role;
import com.greedystar.dubboprovider.dao.RoleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author GreedyStar
 * Date   2020-6-1
 */
@Service
public class RoleService {
    @Autowired
    private RoleDao roleDao;

    public List<Role> getAllRoles() {
        return roleDao.getAllRoles();
    }

}
