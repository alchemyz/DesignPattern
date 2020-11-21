package org.example.creating.factory.abstractFactory;

/**
 * @author winterfell
 */
public interface CarFactory {
    Engine createEngine();

    Seat createSeat();

    Tyre createTyre();
}

