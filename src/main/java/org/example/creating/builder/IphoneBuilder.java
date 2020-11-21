package org.example.creating.builder;

public interface IphoneBuilder {
    Motherboard buildMotherboard();

    Battery buildBattery();

    Display buildDisplay();
}
