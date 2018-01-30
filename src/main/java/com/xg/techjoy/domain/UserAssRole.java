package com.xg.techjoy.domain;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

/**
 * @Author: huang
 * @Description: 用户角色中间表
 * @Date: Created in 15:11 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class UserAssRole {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private User user;

    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Role role;


    public UserAssRole() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}

