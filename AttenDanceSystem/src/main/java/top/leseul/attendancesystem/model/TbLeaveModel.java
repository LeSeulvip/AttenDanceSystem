package top.leseul.attendancesystem.model;

import top.leseul.attendancesystem.base.MyBasePageModel;
import top.leseul.attendancesystem.entity.TbLeave;

/**
 * TbLeave的Model
 * 
 * @author leseul
 *
 */
public class TbLeaveModel extends MyBasePageModel {

  private static final long serialVersionUID = -7622357145742367676L;

  private TbLeave tbLeave=new TbLeave();
  
  public TbLeaveModel() {
  }

  public TbLeave getTbLeave() {
    return tbLeave;
  }

  public void setTbLeave(TbLeave tbLeave) {
    this.tbLeave = tbLeave;
  }
  
}
