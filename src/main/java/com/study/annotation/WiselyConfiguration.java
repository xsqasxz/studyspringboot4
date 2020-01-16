package com.study.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * @author xueshiqi
 * @since 2020/1/9
 * 这里是组合注解，就是说自定义一个注解的方式，将多个注解的功能组合到这个自定义注解上去
 * 这里组合了@Configuration和@ComponentScan注解
 * value() 是属于覆盖参数
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@ComponentScan
public @interface WiselyConfiguration {
    String[] value() default {};
}
