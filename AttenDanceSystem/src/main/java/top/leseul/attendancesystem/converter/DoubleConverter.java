package top.leseul.attendancesystem.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import top.huhuiyu.api.utils.StringUtils;

/**
 * Double数值转换器
 * 
 * @author leseul
 *
 */
@Component
public class DoubleConverter implements Converter<String, Double> {

  @Override
  public Double convert(String source) {
    if (StringUtils.isEmpty(source)) {
      return null;
    }
    source = StringUtils.trim(source);
    try {
      return Double.valueOf(source);
    } catch (Exception ex) {
    }
    return null;
  }

}
