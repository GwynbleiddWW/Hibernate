package ru.netology.hibernate;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {

    PersonRepository repository;

    @Autowired
    public Service(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonByCity(String city) {
        return repository.findByCityOfLiving(city);
    }

    public List<Person> getPersonByAge(int age) {
        return repository.findByAgeLessThan(age);
    }

    public Optional<Person> getPersonByNameAndSurname(String name, String surname) {
        return repository.findByNameAndSurname(name, surname);
    }
}
