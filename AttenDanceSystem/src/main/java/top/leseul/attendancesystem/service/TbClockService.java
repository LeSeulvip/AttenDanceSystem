package top.leseul.attendancesystem.service;

import top.huhuiyu.api.utils.mybase.JsonMessage;
import top.leseul.attendancesystem.model.TbClockModel;

/**
 * TbClock的Service
 * 
 * @author leseul
 *
 */
public interface TbClockService {

  /**
   * 修改TbClock信息
   * 
   * @param model 页面提交数据
   * @return 修改TbClock信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage update(TbClockModel model) throws Exception;

  /**
   * 删除TbClock信息
   * 
   * @param model 页面提交数据
   * @return 删除TbClock信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage delete(TbClockModel model) throws Exception;

  /**
   * 添加TbClock信息
   * 
   * @param model 页面提交数据
   * @return 添加TbClock信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage add(TbClockModel model) throws Exception;

  /**
   * 按照主键查询TbClock信息
   * 
   * @param model 页面提交数据
   * @return 主键查询TbClock信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage queryByKey(TbClockModel model) throws Exception;

  /**
   * 分页查询TbClock信息
   * 
   * @param model 页面提交数据
   * @return 分页查询TbClock信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage queryAll(TbClockModel model) throws Exception;

}
