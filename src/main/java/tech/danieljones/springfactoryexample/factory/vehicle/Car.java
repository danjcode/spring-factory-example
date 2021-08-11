package tech.danieljones.springfactoryexample.factory.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    @Override
    public VehicleType getType() {
        return VehicleType.CAR;
    }

    @Override
    public String getDescription() {
        return "This is a car";
    }
}
