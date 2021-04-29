package ru.tbogatyrev.jsonpostgress.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.tbogatyrev.jsonpostgress.entities.Person;

public interface PersonRepository extends CrudRepository<Person,Long> {
}
