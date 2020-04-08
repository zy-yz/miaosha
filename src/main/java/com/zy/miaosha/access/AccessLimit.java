package com.zy.miaosha.access;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author zhaoyu
 */
//自定义注解,解决秒杀安全性问题接口防刷限流
@Retention(RUNTIME)
@Target(METHOD)
public @interface AccessLimit {
    int seconds();

    int maxCount();

    boolean needLogin() default true;
}
