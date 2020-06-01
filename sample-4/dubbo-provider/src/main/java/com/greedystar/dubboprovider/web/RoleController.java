package com.greedystar.dubboprovider.web;

import com.greedystar.dubboprovider.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author GreedyStar
 * Date   2020-6-1
 */
@RestController
public class RoleController {
    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "roles", method = RequestMethod.GET)
    public Object getAllRoles() {
        return roleService.getAllRoles();
    }

}
