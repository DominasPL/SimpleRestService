package com.github.DominasPL.Webservice.FirstRestService.services;

import com.github.DominasPL.Webservice.FirstRestService.models.Person;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class PersonService {

    private Map<String, Person> people = new HashMap<>();

    public PersonService() {

        Person person = new Person();
        person.setAge(10);
        person.setFirstName("Dominik");
        person.setLastName("Stepuch");
        person.setId("1");
        people.put("1", person);

        Person person1 = new Person();
        person1.setAge(55);
        person1.setFirstName("Zbigniew");
        person1.setLastName("Stonoga");
        person1.setId("2");
        people.put("2", person1);

    }

    public Person getPerson(String id) {

        return people.getOrDefault(id, null);

    }

    public Map<String, Person> getPeople() {
        return people;
    }


}
