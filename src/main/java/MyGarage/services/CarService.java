package MyGarage.services;

import MyGarage.models.Car;
import MyGarage.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    public CarRepository carRepository;

    public String showCarById (Long id){
        Car car = carRepository.findCarById(id);
        return car.toString();
    };
}