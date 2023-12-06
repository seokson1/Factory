package org.example;

public class CarFactory {
    public Car createCar(EngineType engineType) {
        if(engineType.isElectric()) {
            return new ElectreicCar();
        }

        if(engineType.isHydrogen()) {
            return new HydrogenCar();
        }

        if(engineType.isDiesel()) {
            return new DieselCar();
        }
        throw new RuntimeException("엔진이 정의되지 않음");
    }
}
