package com.study.aspectjrt;

import com.study.annotation.MyAction;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 定义一个切面 aspectjrt
 * @author xueshiqi
 * @since 2018/9/13
 */
@Aspect
@Component
public class LogAspect {

    @After(value="@annotation(myAction)")
    public void after(MyAction myAction){
        System.out.println("输出注解："+myAction.name());
    }
}