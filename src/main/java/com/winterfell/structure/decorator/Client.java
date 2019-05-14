package com.winterfell.structure.decorator;

/**
 * @author : zhuzhenjie
 **/
public class Client {
    public static void main(String[] args) {
        ICar car = new Car();
        ICar supperCar = new FlyCar(car);
        supperCar.move();
    }
}
