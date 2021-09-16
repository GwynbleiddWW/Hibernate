package ru.netology.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class Controller {

    Service service;

    @Autowired
    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/persons/by-city")
    public List<Person> byCity(@RequestParam String city) {
        return service.getPersonByCity(city);
    }
}
