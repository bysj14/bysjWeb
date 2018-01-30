package com.xg.techjoy.domain;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

/**
 * @Author: huang
 * @Description: 设计类课题指导老师评审表评语模板
 * @Date: Created in 14:50 2018-01-30  .
 * @Modified by:
 */
@Entity
@DiscriminatorValue("RemarkTemplateForDesignSupervisor")
public class RemarkTemplateForDesignSupervisor extends RemarkTemplate
{

	public RemarkTemplateForDesignSupervisor(){
		super();
	}

	 
	public String getCategory() {
		// TODO : to implement
		return "";
	}

}

