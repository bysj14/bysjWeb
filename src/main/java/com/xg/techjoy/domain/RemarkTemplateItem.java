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
 * @Description: 模板项
 * @Date: Created in 14:51 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class RemarkTemplateItem {

    /*id*/
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /*评论项 例如：态度、文采、内容*/
    @javax.persistence.Column(nullable = false)
    private String preText;

    /*模板*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private RemarkTemplate remakeTemplate;

    /*评论级别 例如：[优秀，良好，差]*/
    @javax.persistence.OneToMany(mappedBy = "remarkTemplateItems")
    private Set<RemarkTemplateItemOption> remarkTemplateItemsOption;


    public RemarkTemplateItem() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPreText() {
        return preText;
    }

    public void setPreText(String preText) {
        this.preText = preText;
    }

    public RemarkTemplate getRemakeTemplate() {
        return remakeTemplate;
    }

    public void setRemakeTemplate(RemarkTemplate remakeTemplate) {
        this.remakeTemplate = remakeTemplate;
    }

    public Set<RemarkTemplateItemOption> getRemarkTemplateItemsOption() {
        return remarkTemplateItemsOption;
    }

    public void setRemarkTemplateItemsOption(Set<RemarkTemplateItemOption> remarkTemplateItemsOption) {
        this.remarkTemplateItemsOption = remarkTemplateItemsOption;
    }
}

