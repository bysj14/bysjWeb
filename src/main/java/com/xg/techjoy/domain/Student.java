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
 * @Description: 学生
 * @Date: Created in 14:58 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class Student extends Actor {

    /*学号*/
    @javax.persistence.Column(nullable = false)
    private String idNo;

    /*qq号*/
    @javax.persistence.Column(nullable = false)
    private String qq;

    /*email*/
    @javax.persistence.Column(nullable = false)
    private String email;

    /*指导老师*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Supervisor supervisor;

    /*课题*/
    @javax.persistence.OneToOne
    private GraduateProject graduateProject;

    /*答辩小组*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private QuestionerTeam questionerTeam;

    /*志愿*/
    @javax.persistence.OneToMany(mappedBy = "student")
    private Set<Application> applications;

    /*班级*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private StudentClass studentClass;


    public Student() {
        super();
    }

    public Student(Long id) {

        this.id = id;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public QuestionerTeam getQuestionerTeam() {
        return questionerTeam;
    }

    public void setQuestionerTeam(QuestionerTeam questionerTeam) {
        this.questionerTeam = questionerTeam;
    }

    public Set<Application> getApplications() {
        return applications;
    }

    public void setApplications(Set<Application> applications) {
        this.applications = applications;
    }

    public StudentClass getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(StudentClass studentClass) {
        this.studentClass = studentClass;
    }
}

