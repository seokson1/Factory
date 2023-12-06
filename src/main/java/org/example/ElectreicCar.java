package org.example;

public class ElectreicCar implements Car {
    @Override
    public void whatIsCar() {
        System.out.println(getClass().getSimpleName());
    }
}
