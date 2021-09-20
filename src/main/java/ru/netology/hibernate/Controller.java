package ru.netology.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
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

    @GetMapping("/persons/age")
    public List<Person> byAge(@RequestParam int age) {
        return service.getPersonByAge(age);
    }

    @GetMapping("/persons/name")
    public Optional<Person> byNameSurname(@RequestParam String name, @RequestParam String surname) {
        return service.getPersonByNameAndSurname(name, surname);
    }
}
