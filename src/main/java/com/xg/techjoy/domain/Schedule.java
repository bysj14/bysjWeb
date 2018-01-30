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
 * @Description: 工作进程表
 * @Date: Created in 14:06 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class Schedule {

    /*id*/
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /*开始时间*/
    @JsonSerialize(using = CustomDateSerializer.class)
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Calendar startDate;

    /*结束时间*/
    @JsonSerialize(using = CustomDateSerializer.class)
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Calendar endDate;

    /*完成的工作内容*/
    @javax.persistence.Column(nullable = false)
    private String workToDo;

    /*评语*/
    @javax.persistence.Column(nullable = false)
    private String comment;

    /*审核老师*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Supervisor examiner;

    /*课题*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private GraduateProject graduateProject;

    public Schedule() {
        super();
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getWorkToDo() {
        return workToDo;
    }

    public void setWorkToDo(String workToDo) {
        this.workToDo = workToDo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

