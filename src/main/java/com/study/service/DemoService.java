package com.study.service;

import org.springframework.stereotype.Service;

/**
 * @author xueshiqi
 * @since 2020/1/9
 * 演示服务Bean
 */
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("组合注解中获取Bean");
    }
}
