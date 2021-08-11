package tech.danieljones.springfactoryexample.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tech.danieljones.springfactoryexample.factory.VehicleFactory;
import tech.danieljones.springfactoryexample.factory.vehicle.VehicleType;

@RestController
public class VehicleController {

    private final VehicleFactory vehicleFactory;

    public VehicleController(VehicleFactory vehicleFactory) {
        this.vehicleFactory = vehicleFactory;
    }

    @GetMapping(value = "/vehicle", produces = "text/plain")
    public ResponseEntity<String> getVehicleDescription(@RequestParam String vehicleType) {
        return ResponseEntity.ok(vehicleFactory.getVehicle(VehicleType.valueOf(vehicleType.toUpperCase())).getDescription());
    }
}
