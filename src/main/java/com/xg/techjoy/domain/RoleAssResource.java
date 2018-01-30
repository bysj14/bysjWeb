package com.xg.techjoy.domain;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
 
@javax.persistence.Entity 
public class RoleAssResource
{

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@javax.persistence.ManyToOne 
	@javax.persistence.JoinColumn(nullable = false) 
	private Role role;

	@javax.persistence.ManyToOne 
	@javax.persistence.JoinColumn(nullable = false) 
	private Resource resource;


	public RoleAssResource(){
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}
}

