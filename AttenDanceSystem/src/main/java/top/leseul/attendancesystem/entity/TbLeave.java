package top.leseul.attendancesystem.entity;

import top.huhuiyu.api.utils.mybase.BaseEntity;

/**
 * TbLeave表
 * 
 * @author leseul
 *
 */
public class TbLeave extends BaseEntity {

  private static final long serialVersionUID = -5082105528122843398L;
  
  private java.lang.Integer id;
  private java.lang.String bname;
  private java.lang.String bdate;
  private java.lang.String edate;
  private java.lang.String info;

  public TbLeave() {
  }
  
  public java.lang.Integer getId(){
    return id;
  }

  public void setId(java.lang.Integer id){
    this.id=id;
  }

  public java.lang.String getBname(){
    return bname;
  }

  public void setBname(java.lang.String bname){
    this.bname=bname;
  }

  public java.lang.String getBdate(){
    return bdate;
  }

  public void setBdate(java.lang.String bdate){
    this.bdate=bdate;
  }

  public java.lang.String getEdate(){
    return edate;
  }

  public void setEdate(java.lang.String edate){
    this.edate=edate;
  }

  public java.lang.String getInfo(){
    return info;
  }

  public void setInfo(java.lang.String info){
    this.info=info;
  }


}
