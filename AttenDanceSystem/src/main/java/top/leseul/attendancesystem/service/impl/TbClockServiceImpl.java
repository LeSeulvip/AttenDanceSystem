package top.leseul.attendancesystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import top.huhuiyu.api.utils.mybase.JsonMessage;
import top.huhuiyu.api.utils.mybase.PageBean;
import top.leseul.attendancesystem.dao.TbClockDAO;
import top.leseul.attendancesystem.entity.TbClock;
import top.leseul.attendancesystem.model.TbClockModel;
import top.leseul.attendancesystem.service.TbClockService;

/**
 * TbClock的实现层
 * 
 * @author leseul
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TbClockServiceImpl implements TbClockService {
  @Autowired
  private TbClockDAO tbClockDAO;

  @Override
  public JsonMessage queryAll(TbClockModel model) throws Exception {
    PageBean page = model.getPage();
    PageHelper.startPage(page.getPageNumber(), page.getPageSize());
    Page<TbClock> list = (Page<TbClock>) tbClockDAO.queryAll();
    model.setPageInfo(list);
    JsonMessage message = JsonMessage.getSuccess("");
    message.putData("page", page);
    message.putData("list", list);
    return message;
  }

  @Override
  public JsonMessage queryByKey(TbClockModel model) throws Exception {
    JsonMessage message = JsonMessage.getSuccess("");
    message.putData("tbClock", tbClockDAO.queryByKey(model.getTbClock()));
    return message;
  }

  @Override
  public JsonMessage add(TbClockModel model) throws Exception {
    int result = tbClockDAO.add(model.getTbClock());
    return result == 1 ? JsonMessage.getSuccess("添加数据成功") : JsonMessage.getFail("添加数据失败");
  }

  @Override
  public JsonMessage delete(TbClockModel model) throws Exception {
    int result = tbClockDAO.delete(model.getTbClock());
    return result == 1 ? JsonMessage.getSuccess("删除数据成功") : JsonMessage.getFail("删除数据失败");
  }

  @Override
  public JsonMessage update(TbClockModel model) throws Exception {
    int result = tbClockDAO.update(model.getTbClock());
    return result == 1 ? JsonMessage.getSuccess("修改数据成功") : JsonMessage.getFail("修改数据失败");
  }
}
