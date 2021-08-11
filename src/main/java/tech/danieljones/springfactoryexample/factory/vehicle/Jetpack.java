package tech.danieljones.springfactoryexample.factory.vehicle;

import org.springframework.stereotype.Component;

@Component
public class Jetpack implements Vehicle {
    @Override
    public VehicleType getType() {
        return VehicleType.JETPACK;
    }

    @Override
    public String getDescription() {
        return "This is a jetpack";
    }
}
