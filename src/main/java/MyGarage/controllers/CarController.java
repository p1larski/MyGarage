package MyGarage.controllers;

import MyGarage.services.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    private CarService carService;

    public CarController (CarService carService){
        this.carService = carService;
    }

    @GetMapping("/hey")
    public String hi() {
        carService.hello();
        return "he";
    }
}
