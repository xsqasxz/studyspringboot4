package com.study.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author xueshiqi
 * @since 2020/1/8
 * 通过@Async注解表明该方法是一个异步放放，如果注解在类级别，表示该类的所有放放都是异步方法，这里注解在了放放上面
 * 方法自动被注入使用ThreadPoolTaskExecutor作为TaskExecutor。
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer number){
        System.out.println("执行异步任务:"+number);
    }

    @Async
    public void executeAsyncTaskPlus(Integer number){
        System.out.println("执行异步任务+1:"+ (number+1));
    }
}
