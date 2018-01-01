package com.changtai.highlight_spring4.ch2.prepost;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class TestService {

    @PostConstruct
    public void init(){
        System.out.println("test-init-method");
    }

    public TestService(){
        super();
        System.out.println("初始化构造函数--TestService");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("test-destroy-method");
    }

}
