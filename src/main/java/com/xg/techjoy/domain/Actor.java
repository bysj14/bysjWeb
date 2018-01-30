package com.xg.techjoy.domain;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */
/**
 * @Author: huang
 * @Description: 所有用户的抽象类
 * @Date: Created in 13:27 2018-01-30  .
 * @Modified by:
 */
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DynamicInsert(true)
@DynamicUpdate(true)
public abstract class Actor {

    /*id*/
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    protected Long id;

    /*名字*/
    @javax.persistence.Column(nullable = false)
    protected String name;

    /*用户*/
    @javax.persistence.OneToOne(mappedBy = "actor")
    protected User user;

    public Actor() {
        super();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

