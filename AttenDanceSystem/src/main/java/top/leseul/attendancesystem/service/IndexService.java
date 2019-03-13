package top.leseul.attendancesystem.service;

import top.huhuiyu.api.utils.mybase.JsonMessage;
import top.leseul.attendancesystem.model.IndexModel;

/**
 * 首页服务
 * 
 * @author leseul
 *
 */
public interface IndexService {

  /**
   * 首页
   * 
   * @param model 页面数据
   * @return 应答结果
   * @throws Exception 处理发生异常
   */
  JsonMessage index(IndexModel model) throws Exception;
}
