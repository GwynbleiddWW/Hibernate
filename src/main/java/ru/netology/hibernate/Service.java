package ru.netology.hibernate;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Service {

    Repository repository;

    @Autowired
    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonByCity(String city){
        return repository.getPersonByCity(city);
    }
}
