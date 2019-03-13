package top.leseul.attendancesystem.entity;

import top.huhuiyu.api.utils.mybase.BaseEntity;

/**
 * TbClock表
 * 
 * @author leseul
 *
 */
public class TbClock extends BaseEntity {

  private static final long serialVersionUID = 1318616782103647790L;
  
  private java.lang.Integer id;
  private java.lang.String cname;
  private java.lang.String sdate;
  private java.lang.String edate;

  public TbClock() {
  }
  
  public java.lang.Integer getId(){
    return id;
  }

  public void setId(java.lang.Integer id){
    this.id=id;
  }

  public java.lang.String getCname(){
    return cname;
  }

  public void setCname(java.lang.String cname){
    this.cname=cname;
  }

  public java.lang.String getSdate(){
    return sdate;
  }

  public void setSdate(java.lang.String sdate){
    this.sdate=sdate;
  }

  public java.lang.String getEdate(){
    return edate;
  }

  public void setEdate(java.lang.String edate){
    this.edate=edate;
  }


}
