package top.leseul.attendancesystem.aop;

import org.aspectj.lang.annotation.Pointcut;

/**
 * 控制器切点定义
 * 
 * @author leseul
 *
 */
public abstract class BaseControllerAop {

  @Pointcut("execution(public * top.leseul.attendancesystem.controller..*.*(..))")
  public void controller() {
  }

}
