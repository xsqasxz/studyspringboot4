package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 这里是一个基本的配置类
 * @author xueshiqi
 * @since 2018/9/13
 */
//将该类型声明为一个配置类
@Configuration
//这里配置一下扫描路径， 会扫描对应路径下面的全部的 @Service @Component @Repository @Controller
@ComponentScan("com.study")
//开启对自定义注解的扫描 如果没有使用自定义注解这里就不需要使用该注解
@EnableAspectJAutoProxy
public class DiConfig {

}