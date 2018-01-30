package com.xg.techjoy.domain;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */
/**
 * @Author: huang
 * @Description: 校优秀论文
 * @Date: Created in 14:00 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class ExcellentGraduateProjectOfUni extends ExcellentGraduateProject {

    /*课题*/
    @javax.persistence.OneToOne(mappedBy = "excellentGraduateProjectOfUni")
    private GraduateProject graduateProject;


    /*省优秀论文*/
    @javax.persistence.OneToOne
    protected ExcellentGraduateProjectOfProvince excellentGraduateProjectOfProvince;


    public ExcellentGraduateProjectOfUni() {
        super();
    }

    public GraduateProject getGraduateProject() {
        return graduateProject;
    }

    public void setGraduateProject(GraduateProject graduateProject) {
        this.graduateProject = graduateProject;
    }

    public ExcellentGraduateProjectOfProvince getExcellentGraduateProjectOfProvince() {
        return excellentGraduateProjectOfProvince;
    }

    public void setExcellentGraduateProjectOfProvince(ExcellentGraduateProjectOfProvince excellentGraduateProjectOfProvince) {
        this.excellentGraduateProjectOfProvince = excellentGraduateProjectOfProvince;
    }
}

