package com.xg.techjoy.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Set;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

/**
 * @Author: huang
 * @Description: 角色
 * @Date: Created in 14:57 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class Role {

    /*id*/
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /*角色名称*/
    @javax.persistence.Column(nullable = false)
    private String roleName;

    @javax.persistence.OneToMany(mappedBy = "role")
    private Set<UserAssRole> userAssRoles;

    @javax.persistence.OneToMany(mappedBy = "role")
    private Set<RoleAssResource> roleAssResources;

    public Role() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<UserAssRole> getUserAssRoles() {
        return userAssRoles;
    }

    public void setUserAssRoles(Set<UserAssRole> userAssRoles) {
        this.userAssRoles = userAssRoles;
    }

    public Set<RoleAssResource> getRoleAssResources() {
        return roleAssResources;
    }

    public void setRoleAssResources(Set<RoleAssResource> roleAssResources) {
        this.roleAssResources = roleAssResources;
    }
}

