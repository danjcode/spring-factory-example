package tech.danieljones.springfactoryexample.factory.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Boat implements Vehicle {
    @Override
    public VehicleType getType() {
        return VehicleType.BOAT;
    }

    @Override
    public String getDescription() {
        return "This is a boat";
    }
}
