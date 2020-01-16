package com;

import com.config.ConditionConfig;
import com.config.DemoConfig;
import com.study.service.DemoService;
import com.study.service.ListService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 切面注解，注入例子
 * @author xueshiqi
 * @since 2018/9/13
 */
public class AopMain {
    public static void main(String [] s){
        /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        //基础注解使用方式，为1.0章节学习内容
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        demoAnnotationService.add();
        //得到Bean的名称，还有读取文件
        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResult();
        context.close();*/

        /*//多线程异步任务
        AnnotationConfigApplicationContext conTask = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = conTask.getBean(AsyncTaskService.class);
        for (int i = 0;i<100;i++){
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
        conTask.close();*/

        /*//计划任务
        AnnotationConfigApplicationContext conTimer = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);*/

        /*//条件注解演示
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(listService.showListCmd());*/

        /*//组合注解演示
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        DemoService demoService = context.getBean(DemoService.class);
        demoService.outputResult();
        context.close();*/
    }

}