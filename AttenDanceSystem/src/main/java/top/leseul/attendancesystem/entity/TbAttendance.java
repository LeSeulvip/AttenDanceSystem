package top.leseul.attendancesystem.entity;

import top.huhuiyu.api.utils.mybase.BaseEntity;

/**
 * TbAttendance表
 * 
 * @author leseul
 *
 */
public class TbAttendance extends BaseEntity {

  private static final long serialVersionUID = 1489559777272339597L;
  
  private java.lang.Integer id;
  private java.lang.String aname;
  private java.lang.String bmonth;
  private java.lang.String holiday;
  private java.lang.String absenteeism;
  private java.lang.String late;
  private java.lang.String early;
  private java.lang.String note;
  private java.lang.String adate;

  public TbAttendance() {
  }
  
  public java.lang.Integer getId(){
    return id;
  }

  public void setId(java.lang.Integer id){
    this.id=id;
  }

  public java.lang.String getAname(){
    return aname;
  }

  public void setAname(java.lang.String aname){
    this.aname=aname;
  }

  public java.lang.String getBmonth(){
    return bmonth;
  }

  public void setBmonth(java.lang.String bmonth){
    this.bmonth=bmonth;
  }

  public java.lang.String getHoliday(){
    return holiday;
  }

  public void setHoliday(java.lang.String holiday){
    this.holiday=holiday;
  }

  public java.lang.String getAbsenteeism(){
    return absenteeism;
  }

  public void setAbsenteeism(java.lang.String absenteeism){
    this.absenteeism=absenteeism;
  }

  public java.lang.String getLate(){
    return late;
  }

  public void setLate(java.lang.String late){
    this.late=late;
  }

  public java.lang.String getEarly(){
    return early;
  }

  public void setEarly(java.lang.String early){
    this.early=early;
  }

  public java.lang.String getNote(){
    return note;
  }

  public void setNote(java.lang.String note){
    this.note=note;
  }

  public java.lang.String getAdate(){
    return adate;
  }

  public void setAdate(java.lang.String adate){
    this.adate=adate;
  }


}
