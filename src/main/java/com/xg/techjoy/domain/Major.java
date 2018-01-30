package com.xg.techjoy.domain;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
/**
 * @Author: huang
 * @Description: 专业
 * @Date: Created in 14:15 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity 
public class Major extends BasicEntity
{

	 
	@javax.persistence.ManyToOne 
	@javax.persistence.JoinColumn(nullable = false) 
	private Department department;


	public Major(){
		super();
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}

