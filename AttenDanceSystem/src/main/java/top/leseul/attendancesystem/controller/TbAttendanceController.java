package top.leseul.attendancesystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.huhuiyu.api.utils.mybase.JsonMessage;
import top.leseul.attendancesystem.model.TbAttendanceModel;
import top.leseul.attendancesystem.service.TbAttendanceService;

/**
 * TbAttendance的控制器
 * 
 * @author leseul
 *
 */
@RestController
@RequestMapping("/TbAttendance")
public class TbAttendanceController {

  @Autowired
  private TbAttendanceService tbAttendanceService;

  @RequestMapping("/queryAll")
  public JsonMessage queryAll(TbAttendanceModel model) throws Exception {
    return tbAttendanceService.queryAll(model);
  }

  @RequestMapping("/add")
  public JsonMessage add(TbAttendanceModel model) throws Exception {
    return tbAttendanceService.add(model);
  }

  @RequestMapping("/update")
  public JsonMessage update(TbAttendanceModel model) throws Exception {
    return tbAttendanceService.update(model);
  }

  @RequestMapping("/delete")
  public JsonMessage delete(TbAttendanceModel model) throws Exception {
    return tbAttendanceService.delete(model);
  }

  @RequestMapping("/queryByKey")
  public JsonMessage queryByKey(TbAttendanceModel model) throws Exception {
    return tbAttendanceService.queryByKey(model);
  }

}
