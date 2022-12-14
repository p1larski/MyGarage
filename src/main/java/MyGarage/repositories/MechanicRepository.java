package MyGarage.repositories;

import MyGarage.models.Mechanic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MechanicRepository extends CrudRepository<Mechanic, Long> {
}
