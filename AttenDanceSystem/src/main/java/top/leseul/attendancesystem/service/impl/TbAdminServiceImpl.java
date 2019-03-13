package top.leseul.attendancesystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import top.huhuiyu.api.utils.mybase.JsonMessage;
import top.huhuiyu.api.utils.mybase.PageBean;
import top.leseul.attendancesystem.dao.TbAdminDAO;
import top.leseul.attendancesystem.entity.TbAdmin;
import top.leseul.attendancesystem.model.TbAdminModel;
import top.leseul.attendancesystem.service.TbAdminService;

/**
 * TbAdmin的实现层
 * 
 * @author leseul
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TbAdminServiceImpl implements TbAdminService {
  @Autowired
  private TbAdminDAO tbAdminDAO;

  @Override
  public JsonMessage queryAll(TbAdminModel model) throws Exception {
    PageBean page = model.getPage();
    PageHelper.startPage(page.getPageNumber(), page.getPageSize());
    Page<TbAdmin> list = (Page<TbAdmin>) tbAdminDAO.queryAll();
    model.setPageInfo(list);
    JsonMessage message = JsonMessage.getSuccess("");
    message.putData("page", page);
    message.putData("list", list);
    return message;
  }

  @Override
  public JsonMessage queryByKey(TbAdminModel model) throws Exception {
    JsonMessage message = JsonMessage.getSuccess("");
    message.putData("tbAdmin", tbAdminDAO.queryByKey(model.getTbAdmin()));
    return message;
  }

  @Override
  public JsonMessage add(TbAdminModel model) throws Exception {
    int result = tbAdminDAO.add(model.getTbAdmin());
    return result == 1 ? JsonMessage.getSuccess("添加数据成功") : JsonMessage.getFail("添加数据失败");
  }

  @Override
  public JsonMessage delete(TbAdminModel model) throws Exception {
    int result = tbAdminDAO.delete(model.getTbAdmin());
    return result == 1 ? JsonMessage.getSuccess("删除数据成功") : JsonMessage.getFail("删除数据失败");
  }

  @Override
  public JsonMessage update(TbAdminModel model) throws Exception {
    int result = tbAdminDAO.update(model.getTbAdmin());
    return result == 1 ? JsonMessage.getSuccess("修改数据成功") : JsonMessage.getFail("修改数据失败");
  }
}
