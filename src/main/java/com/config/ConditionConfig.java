package com.config;

import com.study.condition.LinuxCondition;
import com.study.condition.WindowsCondition;
import com.study.service.ListService;
import com.study.service.impl.LinuxListService;
import com.study.service.impl.WindowsListService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author xueshiqi
 * @since 2020/1/9
 */
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService(){
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService linuxListService(){
        return new LinuxListService();
    }
}
