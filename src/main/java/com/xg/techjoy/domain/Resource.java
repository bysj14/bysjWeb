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
 * @Description: 资源
 * @Date: Created in 14:54 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class Resource {

    /*id*/
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /*路径*/
    @javax.persistence.Column(nullable = false)
    private String url;

    /*菜单名*/
    @javax.persistence.Column(nullable = false)
    private String text;

    /*图标*/
    @javax.persistence.Column(nullable = false)
    private String icon;

    /*节点状态*/
    @javax.persistence.Column(nullable = false)
    private String status;

    @javax.persistence.OneToMany(mappedBy = "resource")
    private Set<RoleAssResource> roleAssResources;

    public Resource() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<RoleAssResource> getRoleAssResources() {
        return roleAssResources;
    }

    public void setRoleAssResources(Set<RoleAssResource> roleAssResources) {
        this.roleAssResources = roleAssResources;
    }
}

