package app.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import app.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author u43721
 */
@RestController
@RequestMapping("/users")
public class UserController {    
    
    @RequestMapping("/test")
    public User getDefault() {        
        System.out.println("N  ew object ...... ");
        System.out.println("New 334  ...... ");
        return new User(1l,"sanjeev");
    }
}
