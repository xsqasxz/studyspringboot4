package com.config;

import com.study.bean.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author xueshiqi
 * @since 2020/1/9
 * 测试使用的config类
 */
@Configuration
public class TestConfig{
    @Bean
    @Profile("dev")
    public TestBean devTestBean(){
        return new TestBean("from development profile");
    }

    @Bean
    @Profile("prod")
    public TestBean prodTestBean(){
        return new TestBean("from production profile");
    }
}
