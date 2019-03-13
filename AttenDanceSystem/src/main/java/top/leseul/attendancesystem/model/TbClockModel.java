package top.leseul.attendancesystem.model;

import top.leseul.attendancesystem.base.MyBasePageModel;
import top.leseul.attendancesystem.entity.TbClock;

/**
 * TbClock的Model
 * 
 * @author leseul
 *
 */
public class TbClockModel extends MyBasePageModel {

  private static final long serialVersionUID = -1344615177813158487L;

  private TbClock tbClock=new TbClock();
  
  public TbClockModel() {
  }

  public TbClock getTbClock() {
    return tbClock;
  }

  public void setTbClock(TbClock tbClock) {
    this.tbClock = tbClock;
  }
  
}
