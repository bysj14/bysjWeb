package com.xg.techjoy.domain;

import javax.persistence.*;
import java.util.Set;



/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
/**
 * @Author: huang
 * @Description: 课题抽象
 * @Date: Created in 14:14 2018-01-30  .
 * @Modified by:
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("GraduateProject")
public abstract class GraduateProject
{

	/*id*/
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	protected Long id;

	/*题目名称*/
	@javax.persistence.Column(nullable = false) 
	protected String title;

	/*副标题*/
	@javax.persistence.Column(nullable = false) 
	protected String subTitle;

	/*年份*/
	@javax.persistence.Column(nullable = false) 
	protected String year;

	/*设计/论文工作内容*/
	@javax.persistence.Column(nullable = false) 
	protected String content;

	/*设计/论文基本需求*/
	@javax.persistence.Column(nullable = false) 
	protected String requirements;

	/*所需基本技能*/
	@javax.persistence.Column(nullable = false) 
	protected String basicString;

	/*主要参考资料及参考文献*/
	@javax.persistence.Column(nullable = false) 
	protected String reference;

	/*提交状态*/
	@javax.persistence.Column(nullable = false) 
	protected Boolean submited;

	/*终稿*/
	@javax.persistence.Column(nullable = false) 
	protected String outcomeReport;

	/*指导关系*/
	@javax.persistence.OneToMany(mappedBy = "graduateProject") 
	protected Set<Supervision> supervisions;

	/*学生*/
	@javax.persistence.OneToOne(mappedBy = "graduateProject") 
	protected Student student;

	/*校优秀论文*/
	@javax.persistence.OneToOne 
	protected ExcellentGraduateProjectOfUni excellentGraduateProjectOfUni;

	/*答辩小组意见表*/
	@javax.persistence.OneToOne(mappedBy = "graduateProject") 
	protected QuestionerTeamReport questionerTeamReport;

	/*评阅人评审表*/
	@javax.persistence.OneToOne(mappedBy = "graduateProject") 
	protected ReviewReport reviewReport;

	/*指导老师评审表*/
	@javax.persistence.OneToOne 
	protected EvaluationReport evaluationReport;

	/*工作进程表*/
	@javax.persistence.OneToMany(mappedBy = "graduateProject") 
	protected Set<Schedule> schedules;

	/**/
	@javax.persistence.OneToMany(mappedBy = "graduateProject") 
	protected Set<ProgressReport> progressReports;

	/*任务书*/
	@javax.persistence.OneToOne(mappedBy = "graduateProject") 
	protected MissionDoc missionDoc;

	/*教研室主任审核*/
	@javax.persistence.ManyToOne 
	@javax.persistence.JoinColumn(nullable = false) 
	protected Approval approvalFromDirector;

	/*评阅人*/
	@javax.persistence.ManyToOne 
	@javax.persistence.JoinColumn(nullable = false) 
	protected Supervisor reviewer;

	/*指导老师*/
	@javax.persistence.ManyToOne 
	@javax.persistence.JoinColumn(nullable = false) 
	protected Supervisor proposer;

	/*题目类型*/
	@javax.persistence.ManyToOne 
	@javax.persistence.JoinColumn(nullable = false) 
	protected GraduateProjectType graduateProjectType;

	/*题目来源*/
	@javax.persistence.ManyToOne 
	@javax.persistence.JoinColumn(nullable = false) 
	protected GraduateProjectFrom graduateProjectFrom;

	/*题目性质*/
	@javax.persistence.ManyToOne 
	@javax.persistence.JoinColumn(nullable = false) 
	protected GraduateProjectNature graduateProjectNature;


	public GraduateProject(){
		super();
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

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRequirements() {
		return requirements;
	}

	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

	public String getBasicString() {
		return basicString;
	}

	public void setBasicString(String basicString) {
		this.basicString = basicString;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Boolean getSubmited() {
		return submited;
	}

	public void setSubmited(Boolean submited) {
		this.submited = submited;
	}

	public String getOutcomeReport() {
		return outcomeReport;
	}

	public void setOutcomeReport(String outcomeReport) {
		this.outcomeReport = outcomeReport;
	}

	public Set<Supervision> getSupervisions() {
		return supervisions;
	}

	public void setSupervisions(Set<Supervision> supervisions) {
		this.supervisions = supervisions;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public ExcellentGraduateProjectOfUni getExcellentGraduateProjectOfUni() {
		return excellentGraduateProjectOfUni;
	}

	public void setExcellentGraduateProjectOfUni(ExcellentGraduateProjectOfUni excellentGraduateProjectOfUni) {
		this.excellentGraduateProjectOfUni = excellentGraduateProjectOfUni;
	}

	public QuestionerTeamReport getQuestionerTeamReport() {
		return questionerTeamReport;
	}

	public void setQuestionerTeamReport(QuestionerTeamReport questionerTeamReport) {
		this.questionerTeamReport = questionerTeamReport;
	}

	public ReviewReport getReviewReport() {
		return reviewReport;
	}

	public void setReviewReport(ReviewReport reviewReport) {
		this.reviewReport = reviewReport;
	}

	public EvaluationReport getEvaluationReport() {
		return evaluationReport;
	}

	public void setEvaluationReport(EvaluationReport evaluationReport) {
		this.evaluationReport = evaluationReport;
	}

	public Set<Schedule> getSchedules() {
		return schedules;
	}

	public void setSchedules(Set<Schedule> schedules) {
		this.schedules = schedules;
	}

	public Set<ProgressReport> getProgressReports() {
		return progressReports;
	}

	public void setProgressReports(Set<ProgressReport> progressReports) {
		this.progressReports = progressReports;
	}

	public MissionDoc getMissionDoc() {
		return missionDoc;
	}

	public void setMissionDoc(MissionDoc missionDoc) {
		this.missionDoc = missionDoc;
	}

	public Approval getApprovalFromDirector() {
		return approvalFromDirector;
	}

	public void setApprovalFromDirector(Approval approvalFromDirector) {
		this.approvalFromDirector = approvalFromDirector;
	}

	public Supervisor getReviewer() {
		return reviewer;
	}

	public void setReviewer(Supervisor reviewer) {
		this.reviewer = reviewer;
	}

	public Supervisor getProposer() {
		return proposer;
	}

	public void setProposer(Supervisor proposer) {
		this.proposer = proposer;
	}

	public GraduateProjectType getGraduateProjectType() {
		return graduateProjectType;
	}

	public void setGraduateProjectType(GraduateProjectType graduateProjectType) {
		this.graduateProjectType = graduateProjectType;
	}

	public GraduateProjectFrom getGraduateProjectFrom() {
		return graduateProjectFrom;
	}

	public void setGraduateProjectFrom(GraduateProjectFrom graduateProjectFrom) {
		this.graduateProjectFrom = graduateProjectFrom;
	}

	public GraduateProjectNature getGraduateProjectNature() {
		return graduateProjectNature;
	}

	public void setGraduateProjectNature(GraduateProjectNature graduateProjectNature) {
		this.graduateProjectNature = graduateProjectNature;
	}
}

