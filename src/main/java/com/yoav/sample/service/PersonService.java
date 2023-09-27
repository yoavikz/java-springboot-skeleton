package com.yoav.sample.service;

import com.yoav.sample.client.PersonClient;
import com.yoav.sample.dto.PersonDTO;
import com.yoav.sample.entity.Person;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class PersonService {

    private final PersonClient personClient;

    public Person getPerson(String id) {
        PersonDTO personDTO = personClient.get(id);
        log.info(personDTO.toString());
        return Person.builder()
                .name(personDTO.getName())
                .height(personDTO.getHeight())
                .weight(personDTO.getMass())
                .bmi(calculateBMI(personDTO.getHeight(), personDTO.getMass()))
                .build();
    }

    private double calculateBMI(double height, double weight) {
        //height in meters, weight in KG
        height /= 100;
        return weight / (height * height);
    }


}