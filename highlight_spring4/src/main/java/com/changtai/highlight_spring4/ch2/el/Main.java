package com.changtai.highlight_spring4.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.changtai.highlight_spring4.ch2.el")
public class Main {

    public static void main(String args[]) throws Exception{
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig config = context.getBean(ElConfig.class);
        config.outputResource();
        context.close();
    }

}
