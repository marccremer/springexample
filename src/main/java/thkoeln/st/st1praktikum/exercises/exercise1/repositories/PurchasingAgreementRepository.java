package thkoeln.st.st1praktikum.exercises.exercise1.repositories;

import org.springframework.data.repository.CrudRepository;
import thkoeln.st.st1praktikum.exercises.exercise1.entities.PurchasingAgreement;

import java.util.UUID;

public interface PurchasingAgreementRepository extends CrudRepository<PurchasingAgreement, UUID> {
}