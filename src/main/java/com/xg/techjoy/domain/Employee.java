package com.xg.techjoy.domain;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */
/**
 * @Author: huang
 * @Description: 校内老师
 * @Date: Created in 13:44 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class Employee extends Supervisor {

    /*职工号*/
    @javax.persistence.Column(nullable = false)
    private String staffNum;

    /*所属教研室*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Department department;


    public Employee() {
        super();
    }

    public String getStaffNum() {
        return staffNum;
    }

    public void setStaffNum(String staffNum) {
        this.staffNum = staffNum;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

