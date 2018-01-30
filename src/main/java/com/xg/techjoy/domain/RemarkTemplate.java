package com.xg.techjoy.domain;

import javax.persistence.*;
import java.util.Set;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

/**
 * @Author: huang
 * @Description: 评语模板
 * @Date: Created in 14:45 2018-01-30  .
 * @Modified by:
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("RemarkTemplate")
public abstract class RemarkTemplate {

    /*id*/
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    protected Long id;

    /*评语名称*/
    @javax.persistence.Column(nullable = false)
    protected String title;

    /*评语类型*/
    @javax.persistence.Column(nullable = false)
    protected String category;

    /*是否是默认模板*/
    @javax.persistence.Column(nullable = false)
    protected Boolean defaultRemarkTemplate;

    /*模板项*/
    @javax.persistence.OneToMany(mappedBy = "remakeTemplate")
    protected Set<RemarkTemplateItem> remarkTemplateItems;

    /*指导老师*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    protected Supervisor supervisor;

    /*教研室*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    protected Department department;


    public RemarkTemplate() {
        super();
    }


    public String getCategory() {
        // TODO : to implement
        return "";
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getDefaultRemarkTemplate() {
        return defaultRemarkTemplate;
    }

    public void setDefaultRemarkTemplate(Boolean defaultRemarkTemplate) {
        this.defaultRemarkTemplate = defaultRemarkTemplate;
    }

    public Set<RemarkTemplateItem> getRemarkTemplateItems() {
        return remarkTemplateItems;
    }

    public void setRemarkTemplateItems(Set<RemarkTemplateItem> remarkTemplateItems) {
        this.remarkTemplateItems = remarkTemplateItems;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

