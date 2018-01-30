package com.xg.techjoy.domain;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
/**
 * @Author: huang
 * @Description: 设计类课题
 * @Date: Created in 13:41 2018-01-30  .
 * @Modified by:
 */
@Entity
@DynamicInsert(true)
@DynamicUpdate(true)
public abstract class DesignGraduateProject extends GraduateProject
{

	public DesignGraduateProject(){
		super();
	}


	public String getCategory() {
		// TODO : to implement
		return "设计";
	}

}

