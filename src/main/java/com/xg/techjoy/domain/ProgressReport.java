package com.xg.techjoy.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.xg.techjoy.jsonDeserialize.CustomDateSerializer;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Calendar;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */
/**
 * @Author: huang
 * @Description: 阶段成果
 * @Date: Created in 14:21 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class ProgressReport {

    /*id*/
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /*评语*/
    @javax.persistence.Column(nullable = false)
    private String comment;

    /*上传时间*/
    @JsonSerialize(using = CustomDateSerializer.class)
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Calendar submitDate;

    /*课题*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private GraduateProject graduateProject;

    /*审核老师*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Supervisor examiner;

    public ProgressReport() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Calendar getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(Calendar submitDate) {
        this.submitDate = submitDate;
    }

    public GraduateProject getGraduateProject() {
        return graduateProject;
    }

    public void setGraduateProject(GraduateProject graduateProject) {
        this.graduateProject = graduateProject;
    }

    public Supervisor getExaminer() {
        return examiner;
    }

    public void setExaminer(Supervisor examiner) {
        this.examiner = examiner;
    }
}

