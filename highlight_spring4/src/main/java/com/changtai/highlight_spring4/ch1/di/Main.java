package com.changtai.highlight_spring4.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String args[]){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService service = context.getBean(UseFunctionService.class);
        System.out.println(service.sayHello("di"));
        context.close();
    }

}
