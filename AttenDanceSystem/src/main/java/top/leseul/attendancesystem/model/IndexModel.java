package top.leseul.attendancesystem.model;

import top.leseul.attendancesystem.base.MyBaseModel;

/**
 * 首页model层
 * 
 * @author leseul
 *
 */
public class IndexModel extends MyBaseModel {

  private static final long serialVersionUID = -8166552556621509692L;
  private String echo;

  public IndexModel() {
  }

  public String getEcho() {
    return echo;
  }

  public void setEcho(String echo) {
    this.echo = echo;
  }

}
