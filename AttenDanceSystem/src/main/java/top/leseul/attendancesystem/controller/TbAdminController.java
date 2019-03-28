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

  @RequestMapping("/login")
  public JsonMessage queryAll(TbAdminModel model) throws Exception {
    return tbAdminService.login(model);
  }

  @RequestMapping("/logout")
  public JsonMessage add(TbAdminModel model) throws Exception {
    return tbAdminService.logout(model);
  }
  
  @RequestMapping("/getUserInfo")
  public JsonMessage getUserInfo(TbAdminModel model) throws Exception {
    return tbAdminService.getUserInfo(model);
  }

}
