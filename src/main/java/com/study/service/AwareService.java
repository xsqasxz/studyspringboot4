package com.study.service;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author xueshiqi
 * @since 2020/1/8
 * 实现BeanNameAware、ResourceLoaderAware接口，获得Bean名称和资源加载的服务
 * 实现BeanNameAware需要重写 serBeanName接口
 * 实现ResourceLoaderAware 需要重写 setResourceLoader 接口
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader= resourceLoader;
    }

    public void outputResult(){
        System.out.println("Bean的名称为："+beanName);
        Resource resource = loader.getResource("classpath:介绍");
        try {
            System.out.println("ResourceLoader加载的文件内容未："+ IOUtils.toString(resource.getInputStream(),"UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
