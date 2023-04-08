package thkoeln.st.st1praktikum.exercises.exercise1.repositories;

import org.springframework.data.repository.CrudRepository;
import thkoeln.st.st1praktikum.exercises.exercise1.entities.Member;

import java.util.UUID;

public interface MemberRepository extends CrudRepository<Member, UUID> {
}