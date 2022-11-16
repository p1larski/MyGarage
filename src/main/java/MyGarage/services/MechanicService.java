package MyGarage.services;

import MyGarage.repositories.MechanicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MechanicService {

    private MechanicRepository mechanicRepository;

    @Autowired
    public MechanicService(MechanicRepository mechanicRepository){
        this.mechanicRepository = mechanicRepository;
    }
}
