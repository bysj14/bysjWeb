package com.xg.techjoy.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Set;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

/**
 * @Author: huang
 * @Description: 用户
 * @Date: Created in 15:10 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class User {

    /*id*/
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /*用户名*/
    @javax.persistence.Column(nullable = false)
    private String username;

    /*密码*/
    @javax.persistence.Column(nullable = false)
    private String password;


    @javax.persistence.OneToMany(mappedBy = "user")
    private Set<UserAssRole> userAssRoles;

    @javax.persistence.OneToOne
    private Actor actor;

    public User() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<UserAssRole> getUserAssRoles() {
        return userAssRoles;
    }

    public void setUserAssRoles(Set<UserAssRole> userAssRoles) {
        this.userAssRoles = userAssRoles;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}

