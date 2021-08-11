package tech.danieljones.springfactoryexample.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tech.danieljones.springfactoryexample.factory.vehicle.Vehicle;
import tech.danieljones.springfactoryexample.factory.vehicle.VehicleType;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class VehicleFactory {

    private static final Map<VehicleType, Vehicle> vehicleCache = new HashMap<>();
    private final List<Vehicle> vehicles;

    @Autowired
    public VehicleFactory(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }


    @PostConstruct
    public void init() {
        for(Vehicle v : vehicles) {
            vehicleCache.put(v.getType(), v);
        }
    }

    public Vehicle getVehicle(VehicleType vehicleType) {
        return vehicleCache.get(vehicleType);
    }
}
