package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author xueshiqi
 * @since 2020/1/8
 * 通过@EnableScheduling注解开启对计划任务的支持
 */
@Configuration
@ComponentScan("com.study.timer")
@EnableScheduling
public class TaskSchedulerConfig {

}
