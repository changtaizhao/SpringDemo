package com.changtai.highlight_spring4.ch1.javaconfig;

public class UseFunctionService {

    public String sayHello(String word, FunctionService functionService){
        return functionService.sayHello(word);
    }


}
