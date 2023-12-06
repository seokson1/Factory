package org.example;

public class HydrogenCar implements Car {
    @Override
    public void whatIsCar() {
        System.out.println(getClass().getSimpleName());
    }
}
