package top.leseul.attendancesystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.huhuiyu.api.utils.mybase.JsonMessage;
import top.leseul.attendancesystem.model.TbDeptModel;
import top.leseul.attendancesystem.service.TbDeptService;

/**
 * TbDept的控制器
 * 
 * @author leseul
 *
 */
@RestController
@RequestMapping("/TbDept")
public class TbDeptController {

  @Autowired
  private TbDeptService tbDeptService;

  @RequestMapping("/queryAll")
  public JsonMessage queryAll(TbDeptModel model) throws Exception {
    return tbDeptService.queryAll(model);
  }

  @RequestMapping("/add")
  public JsonMessage add(TbDeptModel model) throws Exception {
    return tbDeptService.add(model);
  }

  @RequestMapping("/update")
  public JsonMessage update(TbDeptModel model) throws Exception {
    return tbDeptService.update(model);
  }

  @RequestMapping("/delete")
  public JsonMessage delete(TbDeptModel model) throws Exception {
    return tbDeptService.delete(model);
  }

  @RequestMapping("/queryByKey")
  public JsonMessage queryByKey(TbDeptModel model) throws Exception {
    return tbDeptService.queryByKey(model);
  }

}
