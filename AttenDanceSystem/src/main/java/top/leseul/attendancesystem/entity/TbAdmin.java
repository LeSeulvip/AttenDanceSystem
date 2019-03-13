package top.leseul.attendancesystem.entity;

import top.huhuiyu.api.utils.mybase.BaseEntity;

/**
 * TbAdmin表
 * 
 * @author leseul
 *
 */
public class TbAdmin extends BaseEntity {

  private static final long serialVersionUID = -4178289177510538237L;
  
  private java.lang.Integer aid;
  private java.lang.String userName;
  private java.lang.String userPwd;
  private java.lang.String name;
  private java.lang.String tel;
  private java.lang.String inductionInfo;
  private java.lang.String permissions;
  private java.lang.String dept;

  public TbAdmin() {
  }
  
  public java.lang.Integer getAid(){
    return aid;
  }

  public void setAid(java.lang.Integer aid){
    this.aid=aid;
  }

  public java.lang.String getUserName(){
    return userName;
  }

  public void setUserName(java.lang.String userName){
    this.userName=userName;
  }

  public java.lang.String getUserPwd(){
    return userPwd;
  }

  public void setUserPwd(java.lang.String userPwd){
    this.userPwd=userPwd;
  }

  public java.lang.String getName(){
    return name;
  }

  public void setName(java.lang.String name){
    this.name=name;
  }

  public java.lang.String getTel(){
    return tel;
  }

  public void setTel(java.lang.String tel){
    this.tel=tel;
  }

  public java.lang.String getInductionInfo(){
    return inductionInfo;
  }

  public void setInductionInfo(java.lang.String inductionInfo){
    this.inductionInfo=inductionInfo;
  }

  public java.lang.String getPermissions(){
    return permissions;
  }

  public void setPermissions(java.lang.String permissions){
    this.permissions=permissions;
  }

  public java.lang.String getDept(){
    return dept;
  }

  public void setDept(java.lang.String dept){
    this.dept=dept;
  }


}
