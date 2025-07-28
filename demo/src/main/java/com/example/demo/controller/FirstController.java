package com.example.demo.controller;


import com.example.demo.dto.Person;
import com.example.demo.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;

@RestController
@CrossOrigin("*")
public class FirstController {

    @Autowired
    private FirstService firstService;

    @GetMapping("/demo")
    public Person FirstRest() {
        Person person = new Person();
        person.setName("Yasir");
        person.setAge(22);

        return person;
    }

    @PostMapping("/cal")
    public LocalDate cal(@RequestBody Person person) {
        LocalDate calcAge = firstService.calcBirthDate(person.getAge());

        return calcAge;
    }

}



