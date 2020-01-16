package com.study.annotation;

import java.lang.annotation.*;

/**
 * 定义一个注解
 * @author xueshiqi
 * @since 2018/9/13
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyAction {
    String name();
}