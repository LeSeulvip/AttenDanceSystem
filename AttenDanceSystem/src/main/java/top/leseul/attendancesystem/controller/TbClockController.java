package top.leseul.attendancesystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.huhuiyu.api.utils.mybase.JsonMessage;
import top.leseul.attendancesystem.model.TbClockModel;
import top.leseul.attendancesystem.service.TbClockService;

/**
 * TbClock的控制器
 * 
 * @author leseul
 *
 */
@RestController
@RequestMapping("/TbClock")
public class TbClockController {

  @Autowired
  private TbClockService tbClockService;

  @RequestMapping("/queryAll")
  public JsonMessage queryAll(TbClockModel model) throws Exception {
    return tbClockService.queryAll(model);
  }

  @RequestMapping("/add")
  public JsonMessage add(TbClockModel model) throws Exception {
    return tbClockService.add(model);
  }

  @RequestMapping("/update")
  public JsonMessage update(TbClockModel model) throws Exception {
    return tbClockService.update(model);
  }

  @RequestMapping("/delete")
  public JsonMessage delete(TbClockModel model) throws Exception {
    return tbClockService.delete(model);
  }

  @RequestMapping("/queryByKey")
  public JsonMessage queryByKey(TbClockModel model) throws Exception {
    return tbClockService.queryByKey(model);
  }

}
