package top.leseul.attendancesystem.model;

import top.leseul.attendancesystem.base.MyBasePageModel;
import top.leseul.attendancesystem.entity.TbDept;

/**
 * TbDept的Model
 * 
 * @author leseul
 *
 */
public class TbDeptModel extends MyBasePageModel {

  private static final long serialVersionUID = 4036216460376993035L;

  private TbDept tbDept=new TbDept();
  
  public TbDeptModel() {
  }

  public TbDept getTbDept() {
    return tbDept;
  }

  public void setTbDept(TbDept tbDept) {
    this.tbDept = tbDept;
  }
  
}
