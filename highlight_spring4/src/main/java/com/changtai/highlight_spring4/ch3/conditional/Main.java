package com.changtai.highlight_spring4.ch3.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Conditional Main
 *
 * @author zhaoct
 * @date 2018-04-03 19:12
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name") + "系统下的列表命令为:" + listService.showListCmd());
        listService.showListCmd();
        context.close();
    }

}
