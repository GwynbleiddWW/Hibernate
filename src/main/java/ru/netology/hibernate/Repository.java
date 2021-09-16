package ru.netology.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

public class Repository {

    @PersistenceContext
    EntityManager entityManager;

    public List<Person> getPersonByCity(String city) {
        Query query = entityManager.createQuery("select p from Person p where p.cityOfLiving = :cityOfLiving", Person.class);
        query.setParameter("cityOfLiving", city);
        return query.getResultList();
    }
}
