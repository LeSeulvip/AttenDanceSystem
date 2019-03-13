package top.leseul.attendancesystem.service;

import top.huhuiyu.api.utils.mybase.JsonMessage;
import top.leseul.attendancesystem.model.TbAttendanceModel;

/**
 * TbAttendance的Service
 * 
 * @author leseul
 *
 */
public interface TbAttendanceService {

  /**
   * 修改TbAttendance信息
   * 
   * @param model 页面提交数据
   * @return 修改TbAttendance信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage update(TbAttendanceModel model) throws Exception;

  /**
   * 删除TbAttendance信息
   * 
   * @param model 页面提交数据
   * @return 删除TbAttendance信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage delete(TbAttendanceModel model) throws Exception;

  /**
   * 添加TbAttendance信息
   * 
   * @param model 页面提交数据
   * @return 添加TbAttendance信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage add(TbAttendanceModel model) throws Exception;

  /**
   * 按照主键查询TbAttendance信息
   * 
   * @param model 页面提交数据
   * @return 主键查询TbAttendance信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage queryByKey(TbAttendanceModel model) throws Exception;

  /**
   * 分页查询TbAttendance信息
   * 
   * @param model 页面提交数据
   * @return 分页查询TbAttendance信息的结果
   * @throws Exception 处理发生错误
   */
  JsonMessage queryAll(TbAttendanceModel model) throws Exception;

}
