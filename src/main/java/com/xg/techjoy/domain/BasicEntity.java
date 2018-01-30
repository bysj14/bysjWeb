package com.xg.techjoy.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */
/**
 * @Author: huang
 * @Description:
 * @Date: Created in 13:39 2018-01-30  .
 * @Modified by:
 */

@Entity
public abstract class BasicEntity {

    /*id*/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    /*编号*/
    @javax.persistence.Column(nullable = false)
    protected String no;

    /*描述*/
    @javax.persistence.Column(nullable = false)
    protected String description;


    public BasicEntity() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

