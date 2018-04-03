package com.changtai.highlight_spring4.ch3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Async Task Service
 *
 * @author zhaoct
 * @date 2018-04-02 20:36
 */
@Service
public class AsyncTaskService {

    public void executeAsyncTask(Integer i){
        System.out.println("执行异步任务:" + i);
    }

    @Async
    public void executeAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1:" + (i+1));
    }

}
