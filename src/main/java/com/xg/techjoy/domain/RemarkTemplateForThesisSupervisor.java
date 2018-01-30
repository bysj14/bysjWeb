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
 * @Description: 论文类课题指导老师评审表评语模板
 * @Date: Created in 14:51 2018-01-30  .
 * @Modified by:
 */
@Entity
@DiscriminatorValue("RemarkTemplateForThesisSupervisor")
public class RemarkTemplateForThesisSupervisor extends RemarkTemplate
{
	public RemarkTemplateForThesisSupervisor(){
		super();
	}
	 
	public String getCategory() {
		// TODO : to implement
		return "";
	}

}

