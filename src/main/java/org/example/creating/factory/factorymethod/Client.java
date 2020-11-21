package org.example.creating.factory.factorymethod;

/**
 * @author winterfell
 */
public class Client {

    public static void main(String[] args) {

        Car audi = new AudiCarFactory().createCar();
        Car byd = new BydCarFactory().createCar();

        audi.run();
        byd.run();
    }
}
