package MyGarage.controllers;

import MyGarage.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/car/{id}")
    public String getCarById(@PathVariable Long id) {
        String carInformations = carService.showCarById(id).toString();
        return carInformations;
    }
}
