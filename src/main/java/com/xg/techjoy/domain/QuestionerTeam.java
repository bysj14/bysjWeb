package com.xg.techjoy.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.xg.techjoy.jsonDeserialize.CustomDateSerializer;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.util.Calendar;
import java.util.Set;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

/**
 * @Author: huang
 * @Description: 答辩小组
 * @Date: Created in 14:27 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class QuestionerTeam {

    /*id*/
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /*上传时间*/
    @JsonSerialize(using = CustomDateSerializer.class)
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Calendar startTime;

    /*上传时间*/
    @JsonSerialize(using = CustomDateSerializer.class)
    @javax.persistence.Temporal(javax.persistence.TemporalType.DATE)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Calendar endTime;

    /*学生*/
    @javax.persistence.OneToMany(mappedBy = "questionerTeam")
    private Set<Student> students;

    /*答辩老师*/
    @javax.persistence.OneToMany(mappedBy = "questionerTeam")
    private Set<Supervisor> questioners;

    /*答辩小组*/
    @javax.persistence.ManyToOne
    @javax.persistence.JoinColumn(nullable = false)
    private Supervisor leader;

    public QuestionerTeam() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getStartTime() {
        return startTime;
    }

    public void setStartTime(Calendar startTime) {
        this.startTime = startTime;
    }

    public Calendar getEndTime() {
        return endTime;
    }

    public void setEndTime(Calendar endTime) {
        this.endTime = endTime;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    public Set<Supervisor> getQuestioners() {
        return questioners;
    }

    public void setQuestioners(Set<Supervisor> questioners) {
        this.questioners = questioners;
    }

    public Supervisor getLeader() {
        return leader;
    }

    public void setLeader(Supervisor leader) {
        this.leader = leader;
    }
}

