package one.digitalinnovation.apipeoplemanagement2021.repositories;

import one.digitalinnovation.apipeoplemanagement2021.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
