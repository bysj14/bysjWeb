package com.xg.techjoy.domain;

import java.util.Set;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

@javax.persistence.Entity
public class Supervisor extends Actor {

    @javax.persistence.Column(nullable = false)
    private String mobile;

    @javax.persistence.OneToMany(mappedBy = "supervisor")
    private Set<Student> students;


    @javax.persistence.OneToMany(mappedBy = "supervisor")
    private Set<Supervision> supervisions;


    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private QuestionerTeam questionerTeam;


    @javax.persistence.OneToMany(mappedBy = "reviewer")
    private Set<GraduateProject> graduateProjectsByReviewer;


    @javax.persistence.OneToMany(mappedBy = "proposer")
    private Set<GraduateProject> graduateProjectsByProposer;

    @javax.persistence.OneToMany(mappedBy = "supervisor")
    private Set<Application> applications;


    @javax.persistence.OneToMany(mappedBy = "supervisor")
    private Set<RemarkTemplate> remakeTemplate;

    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Degree degree;


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

