package MyGarage.services;

import org.springframework.stereotype.Service;

@Service
public class CarService {
    public String hello (){
        System.out.println("hehe");
        return "hi";
    };
}
