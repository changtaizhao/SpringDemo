package com.changtai.highlight_spring4.ch3.conditional;

/**
 * Windows List Service
 *
 * @author zhaoct
 * @date 2018-04-03 19:06
 */
public class WindowsListService implements ListService{
    @Override
    public String showListCmd() {
        return "dir";
    }
}
