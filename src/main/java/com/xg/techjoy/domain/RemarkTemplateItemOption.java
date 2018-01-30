package com.xg.techjoy.domain;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

/**
 * @Author: huang
 * @Description:
 * @Date: Created in 14:56 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class RemarkTemplateItemOption {

    /*id*/
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /*描述*/
    @javax.persistence.Column(nullable = false)
    private String itemOption;

    /*编号*/
    @javax.persistence.Column(nullable = false)
    private String no;

    /*模板项目*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private RemarkTemplateItem remarkTemplateItems;

    public RemarkTemplateItemOption() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemOption() {
        return itemOption;
    }

    public void setItemOption(String itemOption) {
        this.itemOption = itemOption;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public RemarkTemplateItem getRemarkTemplateItems() {
        return remarkTemplateItems;
    }

    public void setRemarkTemplateItems(RemarkTemplateItem remarkTemplateItems) {
        this.remarkTemplateItems = remarkTemplateItems;
    }
}

