package top.leseul.attendancesystem.model;

import top.leseul.attendancesystem.base.MyBasePageModel;
import top.leseul.attendancesystem.entity.TbAdmin;

/**
 * TbAdmin的Model
 * 
 * @author leseul
 *
 */
public class TbAdminModel extends MyBasePageModel {

  private static final long serialVersionUID = 261267924672844304L;

  private TbAdmin tbAdmin=new TbAdmin();
  
  public TbAdminModel() {
  }

  public TbAdmin getTbAdmin() {
    return tbAdmin;
  }

  public void setTbAdmin(TbAdmin tbAdmin) {
    this.tbAdmin = tbAdmin;
  }
  
}
