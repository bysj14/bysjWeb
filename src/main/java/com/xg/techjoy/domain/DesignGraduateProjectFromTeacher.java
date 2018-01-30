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
 * @Description: 指导老师申报的设计类课题
 * @Date: Created in 13:43 2018-01-30  .
 * @Modified by:
 */
@Entity
@DiscriminatorValue("DesignGraduateProjectFromTeacher")
public class DesignGraduateProjectFromTeacher extends DesignGraduateProject
{

	public DesignGraduateProjectFromTeacher(){
		super();
	}

}

