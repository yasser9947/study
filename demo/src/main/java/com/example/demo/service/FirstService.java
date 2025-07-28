package com.example.demo.service;


import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class FirstService {


    public LocalDate calcBirthDate(Integer age){
        if (age == null){
            return LocalDate.now();
        }

        return LocalDate.now().minusYears(age);
    }
}
