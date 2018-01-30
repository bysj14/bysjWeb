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
 * @Description: 任务书
 * @Date: Created in 13:45 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class MissionDoc {

    /*id*/
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /*是否提交*/
    @javax.persistence.Column(nullable = false)
    private Boolean submit;

    /*附件*/
    @javax.persistence.Column(nullable = false)
    private String file;

    /*是否完成*/
    @javax.persistence.Column(nullable = false)
    private Boolean completeState;

    /*课题*/
    @javax.persistence.OneToOne
    private GraduateProject graduateProject;

    /*教研室主任审核*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Approval approvalFromDirector;

    /*院长审核*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Approval approvalFromDean;


    public MissionDoc() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getSubmit() {
        return submit;
    }

    public void setSubmit(Boolean submit) {
        this.submit = submit;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Boolean getCompleteState() {
        return completeState;
    }

    public void setCompleteState(Boolean completeState) {
        this.completeState = completeState;
    }

    public GraduateProject getGraduateProject() {
        return graduateProject;
    }

    public void setGraduateProject(GraduateProject graduateProject) {
        this.graduateProject = graduateProject;
    }

    public Approval getApprovalFromDirector() {
        return approvalFromDirector;
    }

    public void setApprovalFromDirector(Approval approvalFromDirector) {
        this.approvalFromDirector = approvalFromDirector;
    }

    public Approval getApprovalFromDean() {
        return approvalFromDean;
    }

    public void setApprovalFromDean(Approval approvalFromDean) {
        this.approvalFromDean = approvalFromDean;
    }
}

