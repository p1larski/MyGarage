package MyGarage.controllers;

import MyGarage.models.Car;
import MyGarage.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/car/{id}")
    public String showCarById(@PathVariable Long id) {
        return carService.showCarById(id);
    }
    @PostMapping("/car/new")
    public String newCarForRepair(@RequestBody Car car){
        carService.newCarForRepair(car);
        return "success";
    }
}
