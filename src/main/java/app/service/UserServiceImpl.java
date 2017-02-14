/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.service;

import app.controller.UserController;
import app.dao.UserDao;
import app.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author u43721
 */
@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    UserDao userDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    
    @Override
    public User create(User user) {
        return userDao.save(user);
    }    
}
