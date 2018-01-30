package com.xg.techjoy.domain;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

/**
 * @Author: huang
 * @Description: 学生申报的论文类课题
 * @Date: Created in 15:05 2018-01-30  .
 * @Modified by:
 */
@Entity
@DiscriminatorValue("ThesisGraduateProjectFromStudent")
public class ThesisGraduateProjectFromStudent extends ThesisGraduateProject {

    /*指导老师审核*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Approval approvalFromSupervisor;


    public ThesisGraduateProjectFromStudent() {
        super();
    }

    public Approval getApprovalFromSupervisor() {
        return approvalFromSupervisor;
    }

    public void setApprovalFromSupervisor(Approval approvalFromSupervisor) {
        this.approvalFromSupervisor = approvalFromSupervisor;
    }
}

