package app.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import app.model.User;
import app.service.UserService;
import javax.activation.MimeType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author u43721
 */
@RestController
@RequestMapping("/users")
public class UserController {    
    
    @Autowired
    UserService userService;
    
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    
    @RequestMapping("/test")
    public User getDefault() {              
        System.out.println("New 334  ...... ");
        return new User();
    }
    
    
    @RequestMapping (
            value="/create",
            method = RequestMethod.POST,
            produces = { MediaType.APPLICATION_JSON_VALUE }
            )
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public User save(@RequestBody User user) {             
        
        LOGGER.info("Creating the User ");
        return userService.create(user);
    }
}
