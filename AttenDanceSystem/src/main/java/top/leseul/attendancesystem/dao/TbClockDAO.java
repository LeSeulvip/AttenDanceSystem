package top.leseul.attendancesystem.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import top.leseul.attendancesystem.entity.TbClock;

/**
 * TbClock表的dao
 * 
 * @author leseul
 *
 */
@Mapper
public interface TbClockDAO {
  /**
   * 查询全部TbClock
   *
   * @return TbClock的信息
   * @throws Exception 处理发生异常
   */
  List<TbClock> queryAll() throws Exception;
  
  /**
   * 按照主键查询TbClock
   *
   * @param tbClock主键信息
   * @return 主键查询TbClock的结果
   * @throws Exception 处理发生异常
   */
  TbClock queryByKey(TbClock tbClock) throws Exception;
  
  /**
   * 添加TbClock信息
   *
   * @param tbClock信息
   * @return 添加tbClock信息的结果
   * @throws Exception 处理发生异常
   */
  int add(TbClock tbClock) throws Exception;
  
  /**
   * 修改TbClock信息
   *
   * @param tbClock信息
   * @return 修改tbClock信息的结果
   * @throws Exception 处理发生异常
   */
  int update(TbClock tbClock) throws Exception;
  
  /**
   * 删除TbClock信息
   *
   * @param tbClock信息
   * @return 删除tbClock信息的结果
   * @throws Exception 处理发生异常
   */
  int delete(TbClock tbClock) throws Exception;

}
