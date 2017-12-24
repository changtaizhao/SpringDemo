package com.changtai.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截的add方法")
    public void add(){}

}
