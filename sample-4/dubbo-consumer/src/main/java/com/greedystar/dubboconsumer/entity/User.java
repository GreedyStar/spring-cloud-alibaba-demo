package com.greedystar.dubboconsumer.entity;

import com.greedystar.apidubboprovider.entity.Role;

import java.io.Serializable;
import java.util.List;

/**
 * Author GreedyStar
 * Date   2020-6-1
 */
public class User implements Serializable {
    private int id;
    private String name;
    private String phone;
    private List<Role> roles;

    public User() {
    }

    public User(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
