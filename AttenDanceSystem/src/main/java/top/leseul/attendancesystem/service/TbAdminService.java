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
   * 修改TbAdmin信息
   * 
   * @param model 页面提交数据
   * @return 修改TbAdmin信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage update(TbAdminModel model) throws Exception;

  /**
   * 删除TbAdmin信息
   * 
   * @param model 页面提交数据
   * @return 删除TbAdmin信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage delete(TbAdminModel model) throws Exception;

  /**
   * 添加TbAdmin信息
   * 
   * @param model 页面提交数据
   * @return 添加TbAdmin信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage add(TbAdminModel model) throws Exception;

  /**
   * 按照主键查询TbAdmin信息
   * 
   * @param model 页面提交数据
   * @return 主键查询TbAdmin信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage queryByKey(TbAdminModel model) throws Exception;

  /**
   * 分页查询TbAdmin信息
   * 
   * @param model 页面提交数据
   * @return 分页查询TbAdmin信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage queryAll(TbAdminModel model) throws Exception;

}
