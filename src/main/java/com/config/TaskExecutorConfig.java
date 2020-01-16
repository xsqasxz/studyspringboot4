package com.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @author xueshiqi
 * @since 2020/1/8
 * 利用@EnableAsync注解开启异步任务支持
 * 配置类实现了AsyncConfigurer接口并重写了getAsyncExecutor方法，返回一个 ，这样我们就可以获得一个基础线程池TaskExecutor
 */
@Configuration
@ComponentScan("com.study.task")
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer {

    @Override
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        //线程池维护线程的最少数量
        taskExecutor.setCorePoolSize(5);
        //线程池维护线程的最大数量
        taskExecutor.setMaxPoolSize(100);
        ////线程池所使用的缓冲队列
        taskExecutor.setQueueCapacity(200);
        //线程池维护线程所允许的空闲时间
        taskExecutor.setKeepAliveSeconds(30000);
        taskExecutor.initialize();
        return taskExecutor;
    }
}
