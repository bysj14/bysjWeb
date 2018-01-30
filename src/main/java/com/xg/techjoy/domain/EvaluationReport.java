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
 * @Description: 指导老师评审表
 * @Date: Created in 13:49 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class EvaluationReport {
    /*id*/
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /*任务完成情况（是否完成）*/
    @javax.persistence.Column(nullable = false)
    private Boolean missionCompleted;

    /*中期检查报告（有无）*/
    @javax.persistence.Column(nullable = false)
    private Boolean interimReport;

    /*外文资料翻译字数*/
    @javax.persistence.Column(nullable = false)
    private Long numOfDocTranslation;

    /*基本理论、基本知识、基本技能和外语水平*/
    @javax.persistence.Column(nullable = false)
    private Integer basicTheory;

    /*工作量、工作态度*/
    @javax.persistence.Column(nullable = false)
    private Integer workload;

    /*独立工作能力、分析与解决问题的能力*/
    @javax.persistence.Column(nullable = false)
    private Integer workAbiliity;

    /*完成任务情况及水平*/
    @javax.persistence.Column(nullable = false)
    private Integer level;

    /*论文字数*/
    @javax.persistence.Column(nullable = false)
    private Long numberOfPapers;

    /*外文资料翻译（有无）*/
    @javax.persistence.Column(nullable = false)
    private Boolean docTranslation;

    /*中英文摘要（有无）*/
    @javax.persistence.Column(nullable = false)
    private Boolean summary;

    /*评语*/
    @javax.persistence.Column(nullable = false)
    private String comment;

    /*课题*/
    @javax.persistence.OneToOne(mappedBy = "evaluationReport")
    private GraduateProject graduateProject;

    public EvaluationReport() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getMissionCompleted() {
        return missionCompleted;
    }

    public void setMissionCompleted(Boolean missionCompleted) {
        this.missionCompleted = missionCompleted;
    }

    public Boolean getInterimReport() {
        return interimReport;
    }

    public void setInterimReport(Boolean interimReport) {
        this.interimReport = interimReport;
    }

    public Long getNumOfDocTranslation() {
        return numOfDocTranslation;
    }

    public void setNumOfDocTranslation(Long numOfDocTranslation) {
        this.numOfDocTranslation = numOfDocTranslation;
    }

    public Integer getBasicTheory() {
        return basicTheory;
    }

    public void setBasicTheory(Integer basicTheory) {
        this.basicTheory = basicTheory;
    }

    public Integer getWorkload() {
        return workload;
    }

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }

    public Integer getWorkAbiliity() {
        return workAbiliity;
    }

    public void setWorkAbiliity(Integer workAbiliity) {
        this.workAbiliity = workAbiliity;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Long getNumberOfPapers() {
        return numberOfPapers;
    }

    public void setNumberOfPapers(Long numberOfPapers) {
        this.numberOfPapers = numberOfPapers;
    }

    public Boolean getDocTranslation() {
        return docTranslation;
    }

    public void setDocTranslation(Boolean docTranslation) {
        this.docTranslation = docTranslation;
    }

    public Boolean getSummary() {
        return summary;
    }

    public void setSummary(Boolean summary) {
        this.summary = summary;
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

