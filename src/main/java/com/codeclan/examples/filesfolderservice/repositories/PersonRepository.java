package com.codeclan.examples.filesfolderservice.repositories;

import com.codeclan.examples.filesfolderservice.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
