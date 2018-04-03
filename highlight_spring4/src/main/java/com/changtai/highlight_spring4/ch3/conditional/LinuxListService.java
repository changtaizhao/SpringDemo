package com.changtai.highlight_spring4.ch3.conditional;

/**
 * Linux List Service
 *
 * @author zhaoct
 * @date 2018-04-03 19:07
 */
public class LinuxListService implements ListService{
    @Override
    public String showListCmd() {
        return "ls";
    }
}
