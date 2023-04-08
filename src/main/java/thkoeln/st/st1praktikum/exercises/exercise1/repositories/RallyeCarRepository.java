package thkoeln.st.st1praktikum.exercises.exercise1.repositories;

import org.springframework.data.repository.CrudRepository;
import thkoeln.st.st1praktikum.exercises.exercise1.entities.RallyeCar;

import java.util.UUID;

public interface RallyeCarRepository extends CrudRepository<RallyeCar, UUID> {
}