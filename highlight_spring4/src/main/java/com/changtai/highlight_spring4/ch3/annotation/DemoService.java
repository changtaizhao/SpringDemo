package com.changtai.highlight_spring4.ch3.annotation;

import org.springframework.stereotype.Service;

/**
 * Demo Service
 *
 * @author zhaoct
 * @date 2018-04-03 19:25
 */
@Service
public class DemoService {

    public void outputResult(){
        System.out.println("从组合注解配置获得的bean");
    }

}
