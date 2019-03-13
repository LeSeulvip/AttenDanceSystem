package top.leseul.attendancesystem.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import top.leseul.attendancesystem.entity.TbAttendance;

/**
 * TbAttendance表的dao
 * 
 * @author leseul
 *
 */
@Mapper
public interface TbAttendanceDAO {
  /**
   * 查询全部TbAttendance
   *
   * @return TbAttendance的信息
   * @throws Exception 处理发生异常
   */
  List<TbAttendance> queryAll() throws Exception;
  
  /**
   * 按照主键查询TbAttendance
   *
   * @param tbAttendance主键信息
   * @return 主键查询TbAttendance的结果
   * @throws Exception 处理发生异常
   */
  TbAttendance queryByKey(TbAttendance tbAttendance) throws Exception;
  
  /**
   * 添加TbAttendance信息
   *
   * @param tbAttendance信息
   * @return 添加tbAttendance信息的结果
   * @throws Exception 处理发生异常
   */
  int add(TbAttendance tbAttendance) throws Exception;
  
  /**
   * 修改TbAttendance信息
   *
   * @param tbAttendance信息
   * @return 修改tbAttendance信息的结果
   * @throws Exception 处理发生异常
   */
  int update(TbAttendance tbAttendance) throws Exception;
  
  /**
   * 删除TbAttendance信息
   *
   * @param tbAttendance信息
   * @return 删除tbAttendance信息的结果
   * @throws Exception 处理发生异常
   */
  int delete(TbAttendance tbAttendance) throws Exception;

}
