package top.leseul.attendancesystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import top.huhuiyu.api.utils.mybase.JsonMessage;
import top.huhuiyu.api.utils.mybase.PageBean;
import top.leseul.attendancesystem.dao.TbDeptDAO;
import top.leseul.attendancesystem.entity.TbDept;
import top.leseul.attendancesystem.model.TbDeptModel;
import top.leseul.attendancesystem.service.TbDeptService;

/**
 * TbDept的实现层
 * 
 * @author leseul
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TbDeptServiceImpl implements TbDeptService {
  @Autowired
  private TbDeptDAO tbDeptDAO;

  @Override
  public JsonMessage queryAll(TbDeptModel model) throws Exception {
    PageBean page = model.getPage();
    PageHelper.startPage(page.getPageNumber(), page.getPageSize());
    Page<TbDept> list = (Page<TbDept>) tbDeptDAO.queryAll();
    model.setPageInfo(list);
    JsonMessage message = JsonMessage.getSuccess("");
    message.putData("page", page);
    message.putData("list", list);
    return message;
  }

  @Override
  public JsonMessage queryByKey(TbDeptModel model) throws Exception {
    JsonMessage message = JsonMessage.getSuccess("");
    message.putData("tbDept", tbDeptDAO.queryByKey(model.getTbDept()));
    return message;
  }

  @Override
  public JsonMessage add(TbDeptModel model) throws Exception {
    int result = tbDeptDAO.add(model.getTbDept());
    return result == 1 ? JsonMessage.getSuccess("添加数据成功") : JsonMessage.getFail("添加数据失败");
  }

  @Override
  public JsonMessage delete(TbDeptModel model) throws Exception {
    int result = tbDeptDAO.delete(model.getTbDept());
    return result == 1 ? JsonMessage.getSuccess("删除数据成功") : JsonMessage.getFail("删除数据失败");
  }

  @Override
  public JsonMessage update(TbDeptModel model) throws Exception {
    int result = tbDeptDAO.update(model.getTbDept());
    return result == 1 ? JsonMessage.getSuccess("修改数据成功") : JsonMessage.getFail("修改数据失败");
  }
}
