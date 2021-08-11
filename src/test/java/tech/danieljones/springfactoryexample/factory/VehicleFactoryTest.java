package tech.danieljones.springfactoryexample.factory;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import tech.danieljones.springfactoryexample.factory.vehicle.Boat;
import tech.danieljones.springfactoryexample.factory.vehicle.Car;
import tech.danieljones.springfactoryexample.factory.vehicle.Jetpack;
import tech.danieljones.springfactoryexample.factory.vehicle.VehicleType;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@ContextConfiguration
class VehicleFactoryTest {

    @Autowired
    VehicleFactory factory;

    @Test
    void getVehicle() {
        assert (factory.getVehicle(VehicleType.BOAT) instanceof Boat);
        assert (factory.getVehicle(VehicleType.CAR) instanceof Car);
        assert (factory.getVehicle(VehicleType.JETPACK) instanceof Jetpack);
    }
}