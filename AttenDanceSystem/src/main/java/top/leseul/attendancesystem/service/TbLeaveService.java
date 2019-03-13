package top.leseul.attendancesystem.service;

import top.huhuiyu.api.utils.mybase.JsonMessage;
import top.leseul.attendancesystem.model.TbLeaveModel;

/**
 * TbLeave的Service
 * 
 * @author leseul
 *
 */
public interface TbLeaveService {

  /**
   * 修改TbLeave信息
   * 
   * @param model 页面提交数据
   * @return 修改TbLeave信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage update(TbLeaveModel model) throws Exception;

  /**
   * 删除TbLeave信息
   * 
   * @param model 页面提交数据
   * @return 删除TbLeave信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage delete(TbLeaveModel model) throws Exception;

  /**
   * 添加TbLeave信息
   * 
   * @param model 页面提交数据
   * @return 添加TbLeave信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage add(TbLeaveModel model) throws Exception;

  /**
   * 按照主键查询TbLeave信息
   * 
   * @param model 页面提交数据
   * @return 主键查询TbLeave信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage queryByKey(TbLeaveModel model) throws Exception;

  /**
   * 分页查询TbLeave信息
   * 
   * @param model 页面提交数据
   * @return 分页查询TbLeave信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage queryAll(TbLeaveModel model) throws Exception;

}
