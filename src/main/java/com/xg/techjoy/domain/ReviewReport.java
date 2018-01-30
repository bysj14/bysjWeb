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
 * @Description: 评阅人评审表
 * @Date: Created in 13:50 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class ReviewReport {

    /*id*/
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /*设计/论文质量评分（正确性，条理性，规范性，合理性，清晰，工作量）*/
    @javax.persistence.Column(nullable = false)
    private Integer qualityScore;

    /*成果的技术水平（实用性和创新性）*/
    @javax.persistence.Column(nullable = false)
    private Integer techinqueLevel;

    /*评阅人意见*/
    @javax.persistence.Column(nullable = false)
    private String comment;

    /*课题*/
    @javax.persistence.OneToOne
    private GraduateProject graduateProject;


    public ReviewReport() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQualityScore() {
        return qualityScore;
    }

    public void setQualityScore(Integer qualityScore) {
        this.qualityScore = qualityScore;
    }

    public Integer getTechinqueLevel() {
        return techinqueLevel;
    }

    public void setTechinqueLevel(Integer techinqueLevel) {
        this.techinqueLevel = techinqueLevel;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public GraduateProject getGraduateProject() {
        return graduateProject;
    }

    public void setGraduateProject(GraduateProject graduateProject) {
        this.graduateProject = graduateProject;
    }
}

