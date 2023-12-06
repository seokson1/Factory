package org.example.sub;

import org.example.Car;
import org.example.HydrogenCar;

public class HydrogenCarFactory extends AbstractCarFactory {
    @Override
    public Car createCar() {
        return new HydrogenCar();
    }
}
