package MyGarage.services;

import MyGarage.models.Car;
import MyGarage.models.Mechanic;
import MyGarage.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CarService {

    private CarRepository carRepository;

    @Autowired
    private CarService(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    public String showCarById (Long id){
        Car car = carRepository.findCarById(id);
        return car.toString();
    }

    public String newCarForRepair(Car car){
        carRepository.save(car);
        return "new car added sucessfull";
    }
}