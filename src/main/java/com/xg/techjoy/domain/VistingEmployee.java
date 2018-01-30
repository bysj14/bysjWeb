package com.xg.techjoy.domain;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

/**
 * @Author: huang
 * @Description: 校外老师
 * @Date: Created in 15:11 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class VistingEmployee extends Supervisor {

    /*所属公司*/
    @javax.persistence.Column(nullable = false)
    private String company;

    /*职位*/
    @javax.persistence.Column(nullable = false)
    private String position;

    /*受聘教研室*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Department department;

    public VistingEmployee() {
        super();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

