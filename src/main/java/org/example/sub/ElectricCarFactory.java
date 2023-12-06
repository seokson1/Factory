package org.example.sub;

import org.example.Car;
import org.example.ElectreicCar;

public class ElectricCarFactory extends AbstractCarFactory {
    @Override
    public Car createCar() {
        return new ElectreicCar();
    }
}
