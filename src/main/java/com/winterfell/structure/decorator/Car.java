package com.winterfell.structure.decorator;

/**
 * @author : zhuzhenjie
 **/
public class Car implements ICar {

    @Override
    public void move() {
        System.out.println("车子普通的跑");
    }
}
