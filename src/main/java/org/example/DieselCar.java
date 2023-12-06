package org.example;

public class DieselCar implements Car {
    @Override
    public void whatIsCar() {
        System.out.println(getClass().getSimpleName());
    }
}
