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
 * @Description: 指导老师申报的论文类课题
 * @Date: Created in 15:06 2018-01-30  .
 * @Modified by:
 */
@Entity
@DiscriminatorValue("ThesisGraduateProjectFromTeacher")
public class ThesisGraduateProjectFromTeacher extends ThesisGraduateProject
{

	public ThesisGraduateProjectFromTeacher(){
		super();
	}

}

