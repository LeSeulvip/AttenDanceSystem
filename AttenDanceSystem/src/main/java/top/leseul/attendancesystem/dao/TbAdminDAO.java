package top.leseul.attendancesystem.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import top.leseul.attendancesystem.entity.TbAdmin;
import top.leseul.attendancesystem.entity.TbTokenInfo;

/**
 * TbAdmin表的dao
 * 
 * @author leseul
 *
 */
@Mapper
public interface TbAdminDAO {

  /**
   * 按用户名查询
   * 
   * @param user
   * @return
   * @throws Exception
   */
  TbAdmin queryByUsername(TbAdmin user) throws Exception;

  /**
   * 按照主键查询TbAdmin
   *
   * @param tbAdmin主键信息
   * @return 主键查询TbAdmin的结果
   * @throws Exception 处理发生异常
   */
  TbAdmin queryByKey(TbAdmin tbAdmin) throws Exception;

  /**
   * 查询用户登录相关信息
   * 
   * @param tokenInfo 用户登录信息
   * @return 查询用户登录相关信息的结果
   * @throws Exception处理发生异常
   */
  TbAdmin queryTokenUser(TbTokenInfo tokenInfo) throws Exception;

  /**
   * -添加登录用户信息
   * 
   * @param tokenInfo 用户信息
   * @return 添加登录用户信息的结果
   * @throws Exception 处理发生异常
   */
  int saveUserToToken(TbTokenInfo tokenInfo) throws Exception;

  /**
   * -修改登录用户信息
   * 
   * @param tokenInfo 用户信息
   * @return 修改登录用户信息的结果
   * @throws Exception 处理发生异常
   */
  int updateTokenUser(TbTokenInfo tokenInfo) throws Exception;

  /**
   * -移除登录用户信息
   * 
   * @param tokenInfo 用户信息
   * @return 移除登录用户信息的结果
   * @throws Exception 处理发生异常
   */
  int deleteTokenUser(TbTokenInfo tokenInfo) throws Exception;

  /**
   * 查询全部TbAdmin
   *
   * @return TbAdmin的信息
   * @throws Exception 处理发生异常
   */
  List<TbAdmin> queryAll() throws Exception;


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
