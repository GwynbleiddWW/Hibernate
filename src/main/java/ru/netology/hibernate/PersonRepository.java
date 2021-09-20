package ru.netology.hibernate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByCityOfLiving(String cityOfLiving);

    List<Person> findByAgeLessThan(int age);

    Optional<Person> findByNameAndSurname(String name, String surname);

}