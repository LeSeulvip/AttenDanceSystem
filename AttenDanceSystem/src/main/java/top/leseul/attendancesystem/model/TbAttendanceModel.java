package top.leseul.attendancesystem.model;

import top.leseul.attendancesystem.base.MyBasePageModel;
import top.leseul.attendancesystem.entity.TbAttendance;

/**
 * TbAttendance的Model
 * 
 * @author leseul
 *
 */
public class TbAttendanceModel extends MyBasePageModel {

  private static final long serialVersionUID = -3858876545877764144L;

  private TbAttendance tbAttendance=new TbAttendance();
  
  public TbAttendanceModel() {
  }

  public TbAttendance getTbAttendance() {
    return tbAttendance;
  }

  public void setTbAttendance(TbAttendance tbAttendance) {
    this.tbAttendance = tbAttendance;
  }
  
}
