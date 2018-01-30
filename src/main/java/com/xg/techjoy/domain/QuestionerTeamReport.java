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
 * @Author: 黄丽华
 * @Description: 答辩小组意见表
 * @Date: Created in 13:49 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class QuestionerTeamReport {

    /*id*/
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /*完成任务书规定的要求与水平评分*/
    @javax.persistence.Column(nullable = false)
    private Integer levelScore;

    /*论文与实物的质量评分*/
    @javax.persistence.Column(nullable = false)
    private Integer qualityScore;

    /*论文内容的答辩陈述评分*/
    @javax.persistence.Column(nullable = false)
    private Integer statementScore;

    /*回答问题的正确性评分*/
    @javax.persistence.Column(nullable = false)
    private Integer correctScore;

    /*答辩小组意见*/
    @javax.persistence.Column(nullable = false)
    private String comment;

    /*课题*/
    @javax.persistence.OneToOne
    private GraduateProject graduateProject;

    public QuestionerTeamReport() {
        super();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLevelScore() {
        return levelScore;
    }

    public void setLevelScore(Integer levelScore) {
        this.levelScore = levelScore;
    }

    public Integer getQualityScore() {
        return qualityScore;
    }

    public void setQualityScore(Integer qualityScore) {
        this.qualityScore = qualityScore;
    }

    public Integer getStatementScore() {
        return statementScore;
    }

    public void setStatementScore(Integer statementScore) {
        this.statementScore = statementScore;
    }

    public Integer getCorrectScore() {
        return correctScore;
    }

    public void setCorrectScore(Integer correctScore) {
        this.correctScore = correctScore;
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

