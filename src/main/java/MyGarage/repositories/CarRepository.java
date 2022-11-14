package MyGarage.repositories;

import MyGarage.models.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface CarRepository extends CrudRepository<Car, Long> {
    Car findCarById(int id);
}
