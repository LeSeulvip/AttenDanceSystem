package top.leseul.attendancesystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import top.huhuiyu.api.utils.StringUtils;
import top.huhuiyu.api.utils.mybase.JsonMessage;
import top.huhuiyu.api.utils.mybase.PageBean;
import top.leseul.attendancesystem.dao.TbAttendanceDAO;
import top.leseul.attendancesystem.entity.TbAttendance;
import top.leseul.attendancesystem.model.TbAttendanceModel;
import top.leseul.attendancesystem.service.TbAttendanceService;

/**
 * TbAttendance的实现层
 * 
 * @author leseul
 *
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class TbAttendanceServiceImpl implements TbAttendanceService {
  @Autowired
  private TbAttendanceDAO tbAttendanceDAO;

  @Override
  public JsonMessage queryAll(TbAttendanceModel model) throws Exception {
    PageBean page = model.getPage();
    PageHelper.startPage(page.getPageNumber(), page.getPageSize());
    Page<TbAttendance> list = (Page<TbAttendance>) tbAttendanceDAO.queryAll();
    model.setPageInfo(list);
    JsonMessage message = JsonMessage.getSuccess("");
    message.putData("page", page);
    message.putData("list", list);
    return message;
  }

  @Override
  public JsonMessage queryByKey(TbAttendanceModel model) throws Exception {
    JsonMessage message = JsonMessage.getSuccess("");
    message.putData("tbAttendance", tbAttendanceDAO.queryByKey(model.getTbAttendance()));
    return message;
  }

  @Override
  public JsonMessage add(TbAttendanceModel model) throws Exception {
    TbAttendance attendance = model.getTbAttendance();
    if (StringUtils.isEmpty(attendance.getAname())) {
      return JsonMessage.getFail("姓名不能为空");
    }
    if (StringUtils.isEmpty(attendance.getBmonth())) {
      return JsonMessage.getFail("月份不能为空");
    }
    if (StringUtils.isEmpty(attendance.getAbsenteeism())) {
      return JsonMessage.getFail("假期不能为空");
    }
    if (StringUtils.isEmpty(attendance.getAbsenteeism())) {
      return JsonMessage.getFail("旷工不能为空");
    }
    if (StringUtils.isEmpty(attendance.getLate())) {
      return JsonMessage.getFail("迟到不能为空");
    }
    if (StringUtils.isEmpty(attendance.getEarly())) {
      return JsonMessage.getFail("早退不能为空");
    }
    if (StringUtils.isEmpty(attendance.getNote())) {
      return JsonMessage.getFail("备注不能为空");
    }

    int result = tbAttendanceDAO.add(model.getTbAttendance());
    return result == 1 ? JsonMessage.getSuccess("添加数据成功") : JsonMessage.getFail("添加数据失败");
  }

  @Override
  public JsonMessage delete(TbAttendanceModel model) throws Exception {
    int result = tbAttendanceDAO.delete(model.getTbAttendance());
    return result == 1 ? JsonMessage.getSuccess("删除数据成功") : JsonMessage.getFail("删除数据失败");
  }

  @Override
  public JsonMessage update(TbAttendanceModel model) throws Exception {
    int result = tbAttendanceDAO.update(model.getTbAttendance());
    return result == 1 ? JsonMessage.getSuccess("修改数据成功") : JsonMessage.getFail("修改数据失败");
  }
}
