package top.leseul.attendancesystem.base;

import top.huhuiyu.api.utils.mybase.BaseModel;
import top.leseul.attendancesystem.entity.TbToken;
import top.leseul.attendancesystem.entity.TbTokenInfo;

/**
 * model层基类
 * 
 * @author leseul
 *
 */
public class MyBaseModel extends BaseModel {
  private static final long serialVersionUID = -5765052955006891673L;
  
  public MyBaseModel() {
  }

  /**
   * 获取token的委托方法
   * 
   * @return TbToken信息
   */
  public TbToken makeTbToken() {
    TbToken tbToken = new TbToken();
    tbToken.setToken(getToken());
    return tbToken;
  }

  /**
   * 获取tokeninfo的委托方法
   * 
   * @return TbTokenInfo信息
   */
  public TbTokenInfo makeTbTokenInfo() {
    TbTokenInfo tokenInfo = new TbTokenInfo();
    tokenInfo.setToken(getToken());
    return tokenInfo;
  }

}
