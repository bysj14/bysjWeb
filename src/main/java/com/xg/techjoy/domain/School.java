package com.xg.techjoy.domain;

import java.util.Set;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

/**
 * @Author: huang
 * @Description: 学院
 * @Date: Created in 14:57 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class School extends BasicEntity {

    /*教研室*/
    @javax.persistence.OneToMany(mappedBy = "school")
    private Set<Department> department;


    public School() {
        super();
    }

    public Set<Department> getDepartment() {
        return department;
    }

    public void setDepartment(Set<Department> department) {
        this.department = department;
    }
}

