package top.leseul.attendancesystem.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import top.leseul.attendancesystem.entity.TbAdmin;

/**
 * TbAdmin表的dao
 * 
 * @author leseul
 *
 */
@Mapper
public interface TbAdminDAO {
  /**
   * 查询全部TbAdmin
   *
   * @return TbAdmin的信息
   * @throws Exception 处理发生异常
   */
  List<TbAdmin> queryAll() throws Exception;
  
  /**
   * 按照主键查询TbAdmin
   *
   * @param tbAdmin主键信息
   * @return 主键查询TbAdmin的结果
   * @throws Exception 处理发生异常
   */
  TbAdmin queryByKey(TbAdmin tbAdmin) throws Exception;
  
  /**
   * 添加TbAdmin信息
   *
   * @param tbAdmin信息
   * @return 添加tbAdmin信息的结果
   * @throws Exception 处理发生异常
   */
  int add(TbAdmin tbAdmin) throws Exception;
  
  /**
   * 修改TbAdmin信息
   *
   * @param tbAdmin信息
   * @return 修改tbAdmin信息的结果
   * @throws Exception 处理发生异常
   */
  int update(TbAdmin tbAdmin) throws Exception;
  
  /**
   * 删除TbAdmin信息
   *
   * @param tbAdmin信息
   * @return 删除tbAdmin信息的结果
   * @throws Exception 处理发生异常
   */
  int delete(TbAdmin tbAdmin) throws Exception;

}
