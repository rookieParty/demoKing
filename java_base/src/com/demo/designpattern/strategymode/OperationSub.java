package com.demo.designpattern.strategymode;

/**
 * @Description
 * @Author chuang.li
 * @Date 2021/7/2 11:12
 */
public class OperationSub implements Operation {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
