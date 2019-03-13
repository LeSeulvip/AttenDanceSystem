package top.leseul.attendancesystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.huhuiyu.api.utils.mybase.JsonMessage;
import top.leseul.attendancesystem.model.TbAdminModel;
import top.leseul.attendancesystem.service.TbAdminService;

/**
 * TbAdmin的控制器
 * 
 * @author leseul
 *
 */
@RestController
@RequestMapping("/TbAdmin")
public class TbAdminController {

  @Autowired
  private TbAdminService tbAdminService;

  @RequestMapping("/queryAll")
  public JsonMessage queryAll(TbAdminModel model) throws Exception {
    return tbAdminService.queryAll(model);
  }

  @RequestMapping("/add")
  public JsonMessage add(TbAdminModel model) throws Exception {
    return tbAdminService.add(model);
  }

  @RequestMapping("/update")
  public JsonMessage update(TbAdminModel model) throws Exception {
    return tbAdminService.update(model);
  }

  @RequestMapping("/delete")
  public JsonMessage delete(TbAdminModel model) throws Exception {
    return tbAdminService.delete(model);
  }

  @RequestMapping("/queryByKey")
  public JsonMessage queryByKey(TbAdminModel model) throws Exception {
    return tbAdminService.queryByKey(model);
  }

}
