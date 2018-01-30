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
 * @Description: 志愿类
 * @Date: Created in 13:29 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class Application {

    /*id*/
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /*等级 值域：1（第一志愿）、2（第二志愿）、3（第三志愿）*/
    @javax.persistence.Column(nullable = false)
    private Integer rank;

    /*是否被录取*/
    @javax.persistence.Column(nullable = false)
    private Boolean accepted;

    /*自我介绍*/
    @javax.persistence.Column(nullable = false)
    private String selfIntroduction;

    /*填报志愿的学生*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Student student;

    /*志愿选择的指导老师*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Supervisor supervisor;


    public Application() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Boolean getAccepted() {
        return accepted;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    public String getSelfIntroduction() {
        return selfIntroduction;
    }

    public void setSelfIntroduction(String selfIntroduction) {
        this.selfIntroduction = selfIntroduction;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }
}

