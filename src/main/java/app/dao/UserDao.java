/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.dao;

import app.model.User;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author u43721
 */
@Transactional
public interface UserDao extends  CrudRepository<User, Long> { 
    public User findByName(String anme);    
}
