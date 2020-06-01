package com.greedystar.dubboprovider.service.impl;

import com.greedystar.apidubboprovider.entity.Role;
import com.greedystar.apidubboprovider.service.IRoleService;
import com.greedystar.dubboprovider.dao.RoleDao;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Author GreedyStar
 * Date   2020-6-1
 */
@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private RoleDao roleDao;

    @Override
    public List<Role> getAllRoles() {
        return roleDao.getAllRoles();
    }
}
