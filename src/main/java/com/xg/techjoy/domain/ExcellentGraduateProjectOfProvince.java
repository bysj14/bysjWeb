package com.xg.techjoy.domain;


/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

/**
 * @Author: huang
 * @Description: 省优秀论文
 * @Date: Created in 13:59 2018-01-30  .
 * @Modified by:
 */
@javax.persistence.Entity
public class ExcellentGraduateProjectOfProvince extends ExcellentGraduateProject {

    /*校优秀论文*/
    @javax.persistence.OneToOne(mappedBy = "excellentGraduateProjectOfProvince")
    private ExcellentGraduateProjectOfUni excellentGraduateProjectOfUni;


    public ExcellentGraduateProjectOfProvince() {
        super();
    }

    public ExcellentGraduateProjectOfUni getExcellentGraduateProjectOfUni() {
        return excellentGraduateProjectOfUni;
    }

    public void setExcellentGraduateProjectOfUni(ExcellentGraduateProjectOfUni excellentGraduateProjectOfUni) {
        this.excellentGraduateProjectOfUni = excellentGraduateProjectOfUni;
    }
}

