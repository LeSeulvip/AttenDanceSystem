package top.leseul.attendancesystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import top.huhuiyu.api.utils.mybase.JsonMessage;
import top.huhuiyu.api.utils.mybase.PageBean;
import top.leseul.attendancesystem.dao.TbLeaveDAO;
import top.leseul.attendancesystem.entity.TbLeave;
import top.leseul.attendancesystem.model.TbLeaveModel;
import top.leseul.attendancesystem.service.TbLeaveService;

/**
 * TbLeave的实现层
 * 
 * @author leseul
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TbLeaveServiceImpl implements TbLeaveService {
  @Autowired
  private TbLeaveDAO tbLeaveDAO;

  @Override
  public JsonMessage queryAll(TbLeaveModel model) throws Exception {
    PageBean page = model.getPage();
    PageHelper.startPage(page.getPageNumber(), page.getPageSize());
    Page<TbLeave> list = (Page<TbLeave>) tbLeaveDAO.queryAll();
    model.setPageInfo(list);
    JsonMessage message = JsonMessage.getSuccess("");
    message.putData("page", page);
    message.putData("list", list);
    return message;
  }

  @Override
  public JsonMessage queryByKey(TbLeaveModel model) throws Exception {
    JsonMessage message = JsonMessage.getSuccess("");
    message.putData("tbLeave", tbLeaveDAO.queryByKey(model.getTbLeave()));
    return message;
  }

  @Override
  public JsonMessage add(TbLeaveModel model) throws Exception {
    int result = tbLeaveDAO.add(model.getTbLeave());
    return result == 1 ? JsonMessage.getSuccess("添加数据成功") : JsonMessage.getFail("添加数据失败");
  }

  @Override
  public JsonMessage delete(TbLeaveModel model) throws Exception {
    int result = tbLeaveDAO.delete(model.getTbLeave());
    return result == 1 ? JsonMessage.getSuccess("删除数据成功") : JsonMessage.getFail("删除数据失败");
  }

  @Override
  public JsonMessage update(TbLeaveModel model) throws Exception {
    int result = tbLeaveDAO.update(model.getTbLeave());
    return result == 1 ? JsonMessage.getSuccess("修改数据成功") : JsonMessage.getFail("修改数据失败");
  }
}
