package com.changtai.highlight_spring4.ch3.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Task Scheduler Config
 *
 * @author zhaoct
 * @date 2018-04-03 17:37
 */
@Configuration
@ComponentScan("com.changtai.highlight_spring4.ch3.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
}
