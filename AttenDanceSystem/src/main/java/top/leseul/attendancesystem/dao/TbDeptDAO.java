package top.leseul.attendancesystem.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import top.leseul.attendancesystem.entity.TbDept;

/**
 * TbDept表的dao
 * 
 * @author leseul
 *
 */
@Mapper
public interface TbDeptDAO {
  /**
   * 查询全部TbDept
   *
   * @return TbDept的信息
   * @throws Exception 处理发生异常
   */
  List<TbDept> queryAll() throws Exception;
  
  /**
   * 按照主键查询TbDept
   *
   * @param tbDept主键信息
   * @return 主键查询TbDept的结果
   * @throws Exception 处理发生异常
   */
  TbDept queryByKey(TbDept tbDept) throws Exception;
  
  /**
   * 添加TbDept信息
   *
   * @param tbDept信息
   * @return 添加tbDept信息的结果
   * @throws Exception 处理发生异常
   */
  int add(TbDept tbDept) throws Exception;
  
  /**
   * 修改TbDept信息
   *
   * @param tbDept信息
   * @return 修改tbDept信息的结果
   * @throws Exception 处理发生异常
   */
  int update(TbDept tbDept) throws Exception;
  
  /**
   * 删除TbDept信息
   *
   * @param tbDept信息
   * @return 删除tbDept信息的结果
   * @throws Exception 处理发生异常
   */
  int delete(TbDept tbDept) throws Exception;

}
