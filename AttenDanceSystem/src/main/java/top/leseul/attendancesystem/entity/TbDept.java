package top.leseul.attendancesystem.entity;

import top.huhuiyu.api.utils.mybase.BaseEntity;

/**
 * TbDept表
 * 
 * @author leseul
 *
 */
public class TbDept extends BaseEntity {

  private static final long serialVersionUID = 338752191875608502L;
  
  private java.lang.Integer id;
  private java.lang.String dname;
  private java.lang.String info;
  private java.lang.String tel;

  public TbDept() {
  }
  
  public java.lang.Integer getId(){
    return id;
  }

  public void setId(java.lang.Integer id){
    this.id=id;
  }

  public java.lang.String getDname(){
    return dname;
  }

  public void setDname(java.lang.String dname){
    this.dname=dname;
  }

  public java.lang.String getInfo(){
    return info;
  }

  public void setInfo(java.lang.String info){
    this.info=info;
  }

  public java.lang.String getTel(){
    return tel;
  }

  public void setTel(java.lang.String tel){
    this.tel=tel;
  }


}
