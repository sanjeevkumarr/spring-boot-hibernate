/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.service;

import app.model.User;
import org.springframework.stereotype.Service;

/**
 *
 * @author u43721
*/
@Service
public interface UserService {    
    public User create(User user);    
    
}
