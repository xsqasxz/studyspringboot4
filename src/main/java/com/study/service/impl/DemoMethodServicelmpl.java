package com.study.service.impl;

import com.study.annotation.MyAction;
import com.study.service.DemoAnnotationService;
import org.springframework.stereotype.Service;

/**
 * 此类用于使用注解来创建的类型 aspectjrt
 * @author xueshiqi
 * @since 2018/9/13
 */
@Service
public class DemoMethodServicelmpl implements DemoAnnotationService {

    @MyAction(name = "注解式拦截的add操作")
    @Override
    public void add() {
    }
}