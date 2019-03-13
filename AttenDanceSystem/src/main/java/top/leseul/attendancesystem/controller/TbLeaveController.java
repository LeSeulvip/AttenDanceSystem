package top.leseul.attendancesystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.huhuiyu.api.utils.mybase.JsonMessage;
import top.leseul.attendancesystem.model.TbLeaveModel;
import top.leseul.attendancesystem.service.TbLeaveService;

/**
 * TbLeave的控制器
 * 
 * @author leseul
 *
 */
@RestController
@RequestMapping("/TbLeave")
public class TbLeaveController {

  @Autowired
  private TbLeaveService tbLeaveService;

  @RequestMapping("/queryAll")
  public JsonMessage queryAll(TbLeaveModel model) throws Exception {
    return tbLeaveService.queryAll(model);
  }

  @RequestMapping("/add")
  public JsonMessage add(TbLeaveModel model) throws Exception {
    return tbLeaveService.add(model);
  }

  @RequestMapping("/update")
  public JsonMessage update(TbLeaveModel model) throws Exception {
    return tbLeaveService.update(model);
  }

  @RequestMapping("/delete")
  public JsonMessage delete(TbLeaveModel model) throws Exception {
    return tbLeaveService.delete(model);
  }

  @RequestMapping("/queryByKey")
  public JsonMessage queryByKey(TbLeaveModel model) throws Exception {
    return tbLeaveService.queryByKey(model);
  }

}
