package cn.com.dhc.anno.cn.com.dhc.anno03;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/5 - 下午5:23
 * @Description: cn.com.dhc.anno.cn.com.dhc.anno03
 * @version: 1.0
 */
@Retention(RetentionPolicy.CLASS)
public @interface MyAnnotation {
    String[] value();
}
