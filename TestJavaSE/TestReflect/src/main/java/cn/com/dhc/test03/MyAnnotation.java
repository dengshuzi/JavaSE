package cn.com.dhc.test03;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;

/**
 * @Auther: Evin_D
 * @Date: 2023/2/15 - 下午7:32
 * @Description: cn.com.dhc.test03
 * @version: 1.0
 */
/*
@Target: 定义当前注解能够修饰程序中的哪些元素
@Retention: 定义注解的生命周期
 */
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String value(); // 属性
}
