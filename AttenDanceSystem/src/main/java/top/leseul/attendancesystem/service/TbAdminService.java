package top.leseul.attendancesystem.service;

import top.huhuiyu.api.utils.mybase.JsonMessage;
import top.leseul.attendancesystem.model.TbAdminModel;

/**
 * TbAdmin的Service
 * 
 * @author leseul
 *
 */
public interface TbAdminService {

  /**
   * 登出
   * @param model
   * @return
   * @throws Exception
   */
  JsonMessage logout(TbAdminModel model) throws Exception;

  /**
   * 获取用户信息
   * @param model
   * @return
   * @throws Exception
   */
  JsonMessage getUserInfo(TbAdminModel model) throws Exception;

  /**
   * 登录
   * @param model
   * @return
   * @throws Exception
   */
  JsonMessage login(TbAdminModel model) throws Exception;

  JsonMessage update(TbAdminModel model) throws Exception;

  JsonMessage delete(TbAdminModel model) throws Exception;

  JsonMessage add(TbAdminModel model) throws Exception;

  JsonMessage queryByKey(TbAdminModel model) throws Exception;

  JsonMessage queryAll(TbAdminModel model) throws Exception;


}
