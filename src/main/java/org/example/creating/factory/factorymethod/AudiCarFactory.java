package org.example.creating.factory.factorymethod;

/**
 * @author winterfell
 */
public class AudiCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
