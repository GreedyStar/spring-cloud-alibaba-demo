package com.greedystar.nacosconfig.service;

import com.greedystar.nacosconfig.dao.UserDao;
import com.greedystar.nacosconfig.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author GreedyStar
 * Date  2020-05-18
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    
    public User get(String id){
        return userDao.get(id);
    }
    
    public List<User> findList(User user) {
        return userDao.findList(user);
    }
    
    public List<User> findAllList() {
        return userDao.findAllList();
    }
    
    public int insert(User user) {
        return userDao.insert(user);
    }
    
    public int insertBatch(List<User> users){
        return userDao.insertBatch(users);
    }
    
    public int update(User user) {
        return userDao.update(user);
    }
    
    public int delete(User user) {
        return userDao.delete(user);
    }

}
