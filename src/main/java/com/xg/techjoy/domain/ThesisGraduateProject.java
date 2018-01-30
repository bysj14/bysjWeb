package com.xg.techjoy.domain;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

/**
 * @Author: huang
 * @Description: 论文课题抽象
 * @Date: Created in 15:02 2018-01-30  .
 * @Modified by:
 */
@Entity
@DynamicInsert(true)
@DynamicUpdate(true)
public abstract class ThesisGraduateProject extends GraduateProject {

    /*开题报告*/
    @javax.persistence.OneToOne(mappedBy = "thesisGraduateProject")
    protected ThesisProposal thesisProposal;

    public ThesisGraduateProject() {
        super();
    }

    public String getCategory() {
        // TODO : to implement
        return "论文";
    }

    public ThesisProposal getThesisProposal() {
        return thesisProposal;
    }

    public void setThesisProposal(ThesisProposal thesisProposal) {
        this.thesisProposal = thesisProposal;
    }
}

