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
 * @Description: 开题报告
 * @Date: Created in 15:10 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class ThesisProposal {

    /*id*/
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /*附件*/
    @javax.persistence.Column(nullable = false)
    private String file;

    /*完成状态*/
    @javax.persistence.Column(nullable = false)
    private  Boolean completeState;

    /*论文类课题*/
    @javax.persistence.OneToOne
    private ThesisGraduateProject thesisGraduateProject;

    /*教研室主任审核*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Approval approvalFromDirector;

    /*指导老师审核*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Approval approvalFromSupervisor;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public ThesisGraduateProject getThesisGraduateProject() {
        return thesisGraduateProject;
    }

    public void setThesisGraduateProject(ThesisGraduateProject thesisGraduateProject) {
        this.thesisGraduateProject = thesisGraduateProject;
    }

    public Approval getApprovalFromDirector() {
        return approvalFromDirector;
    }

    public void setApprovalFromDirector(Approval approvalFromDirector) {
        this.approvalFromDirector = approvalFromDirector;
    }

    public Approval getApprovalFromSupervisor() {
        return approvalFromSupervisor;
    }

    public void setApprovalFromSupervisor(Approval approvalFromSupervisor) {
        this.approvalFromSupervisor = approvalFromSupervisor;
    }
}

