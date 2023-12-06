package org.example.sub;

import org.example.Car;
import org.example.DieselCar;

public class DieselCarFactory extends AbstractCarFactory {
    @Override
    public Car createCar() {
        return new DieselCar();
    }
}
