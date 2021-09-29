package ru.netology.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;
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
    @Secured("ROLE_READ")
    public List<Person> byCity(@RequestParam String city) {
        return service.getPersonByCity(city);
    }

    @GetMapping("/persons/age")
    @RolesAllowed("ROLE_WRITE")
    public List<Person> byAge(@RequestParam int age) {
        return service.getPersonByAge(age);
    }

    @GetMapping("/persons/name")
    @PreAuthorize("hasRole('WRITE') or hasRole('DELETE')")
    public Optional<Person> byNameSurname(@RequestParam String name, @RequestParam String surname) {
        return service.getPersonByNameAndSurname(name, surname);
    }


    @GetMapping("/username")
    @PreAuthorize("#username == authentication.principal.username")
    public String userName(@RequestParam String username) {
        return "Hello, " + username;
    }
}
