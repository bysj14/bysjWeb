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
 * @Description: 学生申报的设计类课题
 * @Date: Created in 13:42 2018-01-30  .
 * @Modified by:
 */
@Entity
@DiscriminatorValue("DesignGraduateProjectFromStudent")
public class DesignGraduateProjectFromStudent extends DesignGraduateProject {

    /*指导老师审核*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Approval approvalFromSupervisor;


    public DesignGraduateProjectFromStudent() {
        super();
    }

    public Approval getApprovalFromSupervisor() {
        return approvalFromSupervisor;
    }

    public void setApprovalFromSupervisor(Approval approvalFromSupervisor) {
        this.approvalFromSupervisor = approvalFromSupervisor;
    }
}

