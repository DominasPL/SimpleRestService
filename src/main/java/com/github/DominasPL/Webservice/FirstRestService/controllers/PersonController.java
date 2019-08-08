package com.github.DominasPL.Webservice.FirstRestService.controllers;

import com.github.DominasPL.Webservice.FirstRestService.models.Person;
import com.github.DominasPL.Webservice.FirstRestService.services.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/people")
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/all")
    public Map<String, Person> getAll() {
        return personService.getPeople();
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable("id") String id) {
        return personService.getPerson(id);
    }




}
