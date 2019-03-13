package top.leseul.attendancesystem.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import top.leseul.attendancesystem.entity.TbLeave;

/**
 * TbLeave表的dao
 * 
 * @author leseul
 *
 */
@Mapper
public interface TbLeaveDAO {
  /**
   * 查询全部TbLeave
   *
   * @return TbLeave的信息
   * @throws Exception 处理发生异常
   */
  List<TbLeave> queryAll() throws Exception;
  
  /**
   * 按照主键查询TbLeave
   *
   * @param tbLeave主键信息
   * @return 主键查询TbLeave的结果
   * @throws Exception 处理发生异常
   */
  TbLeave queryByKey(TbLeave tbLeave) throws Exception;
  
  /**
   * 添加TbLeave信息
   *
   * @param tbLeave信息
   * @return 添加tbLeave信息的结果
   * @throws Exception 处理发生异常
   */
  int add(TbLeave tbLeave) throws Exception;
  
  /**
   * 修改TbLeave信息
   *
   * @param tbLeave信息
   * @return 修改tbLeave信息的结果
   * @throws Exception 处理发生异常
   */
  int update(TbLeave tbLeave) throws Exception;
  
  /**
   * 删除TbLeave信息
   *
   * @param tbLeave信息
   * @return 删除tbLeave信息的结果
   * @throws Exception 处理发生异常
   */
  int delete(TbLeave tbLeave) throws Exception;

}
