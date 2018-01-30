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
 * @Description: 指导老师
 * @Date: Created in 16:29 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class Supervisor extends Actor {

    /*联系电话*/
    @javax.persistence.Column(nullable = false)
    private String mobile;

    /*学生*/
    @javax.persistence.OneToMany(mappedBy = "supervisor")
    private Set<Student> students;

    /*指导关系*/
    @javax.persistence.OneToMany(mappedBy = "supervisor")
    private Set<Supervision> supervisions;

    /*答辩小组*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private QuestionerTeam questionerTeam;

    /*课题（评阅人）*/
    @javax.persistence.OneToMany(mappedBy = "reviewer")
    private Set<GraduateProject> graduateProjectsByReviewer;

    /*课题（指导老师）*/
    @javax.persistence.OneToMany(mappedBy = "proposer")
    private Set<GraduateProject> graduateProjectsByProposer;

    /*志愿*/
    @javax.persistence.OneToMany(mappedBy = "supervisor")
    private Set<Application> applications;

    /*评语模板*/
    @javax.persistence.OneToMany(mappedBy = "supervisor")
    private Set<RemarkTemplate> remakeTemplate;

    /*学位*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Degree degree;

    /*职称*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private ProfTitle profTitle;

    public Supervisor() {
        super();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Set<Supervision> getSupervisions() {
        return supervisions;
    }

    public void setSupervisions(Set<Supervision> supervisions) {
        this.supervisions = supervisions;
    }

    public QuestionerTeam getQuestionerTeam() {
        return questionerTeam;
    }

    public void setQuestionerTeam(QuestionerTeam questionerTeam) {
        this.questionerTeam = questionerTeam;
    }

    public Set<GraduateProject> getGraduateProjectsByReviewer() {
        return graduateProjectsByReviewer;
    }

    public void setGraduateProjectsByReviewer(Set<GraduateProject> graduateProjectsByReviewer) {
        this.graduateProjectsByReviewer = graduateProjectsByReviewer;
    }

    public Set<GraduateProject> getGraduateProjectsByProposer() {
        return graduateProjectsByProposer;
    }

    public void setGraduateProjectsByProposer(Set<GraduateProject> graduateProjectsByProposer) {
        this.graduateProjectsByProposer = graduateProjectsByProposer;
    }

    public Set<Application> getApplications() {
        return applications;
    }

    public void setApplications(Set<Application> applications) {
        this.applications = applications;
    }

    public Set<RemarkTemplate> getRemakeTemplate() {
        return remakeTemplate;
    }

    public void setRemakeTemplate(Set<RemarkTemplate> remakeTemplate) {
        this.remakeTemplate = remakeTemplate;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public ProfTitle getProfTitle() {
        return profTitle;
    }

    public void setProfTitle(ProfTitle profTitle) {
        this.profTitle = profTitle;
    }
}

