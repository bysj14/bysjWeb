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
 * @Description: 设计类课题答辩小组意见表评语模板
 * @Date: Created in 14:47 2018-01-30  .
 * @Modified by:
 */

@Entity
@DiscriminatorValue("RemarkTemplateForDesignGroup")
public class RemarkTemplateForDesignGroup extends RemarkTemplate
{

	public RemarkTemplateForDesignGroup(){
		super();
	}

	 
	public String getCategory() {
		// TODO : to implement
		return "";
	}

}

