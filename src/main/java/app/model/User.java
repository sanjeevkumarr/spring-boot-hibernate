package app.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author u43721
 */
@Entity
@Table(name ="user")
public class User {
    
    
    public User(Long id , String name) {
            this.id = id;
            this.name = name;
    }
    
    
    private String name;
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
