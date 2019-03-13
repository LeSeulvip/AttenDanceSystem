package top.leseul.attendancesystem.service;

import top.huhuiyu.api.utils.mybase.JsonMessage;
import top.leseul.attendancesystem.model.TbDeptModel;

/**
 * TbDept的Service
 * 
 * @author leseul
 *
 */
public interface TbDeptService {

  /**
   * 修改TbDept信息
   * 
   * @param model 页面提交数据
   * @return 修改TbDept信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage update(TbDeptModel model) throws Exception;

  /**
   * 删除TbDept信息
   * 
   * @param model 页面提交数据
   * @return 删除TbDept信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage delete(TbDeptModel model) throws Exception;

  /**
   * 添加TbDept信息
   * 
   * @param model 页面提交数据
   * @return 添加TbDept信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage add(TbDeptModel model) throws Exception;

  /**
   * 按照主键查询TbDept信息
   * 
   * @param model 页面提交数据
   * @return 主键查询TbDept信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage queryByKey(TbDeptModel model) throws Exception;

  /**
   * 分页查询TbDept信息
   * 
   * @param model 页面提交数据
   * @return 分页查询TbDept信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage queryAll(TbDeptModel model) throws Exception;

}
