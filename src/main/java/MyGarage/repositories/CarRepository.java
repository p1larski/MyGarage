package MyGarage.repositories;

import MyGarage.models.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
    Car findCarById(Long id);
}
