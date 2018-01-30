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
 * @Description: 指导关系
 * @Date: Created in 15:01 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class Supervision {

    /*是否是主指导关系*/
    @javax.persistence.Column(nullable = false)
    private Boolean asChief;

    /*id*/
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /*指导老师*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Supervisor supervisor;

    /*课题*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private GraduateProject graduateProject;


    public Supervision() {
        super();
    }

    public Boolean getAsChief() {
        return asChief;
    }

    public void setAsChief(Boolean asChief) {
        this.asChief = asChief;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public GraduateProject getGraduateProject() {
        return graduateProject;
    }

    public void setGraduateProject(GraduateProject graduateProject) {
        this.graduateProject = graduateProject;
    }
}

