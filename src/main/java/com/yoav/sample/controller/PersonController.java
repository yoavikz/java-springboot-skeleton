package com.yoav.sample.controller;

import com.yoav.sample.service.PersonService;
import com.yoav.sample.entity.Person;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("/person/{id}")
    public Person getPerson(@PathVariable String id) {
        log.info("Received a get person API call with id " + id);
        return personService.getPerson(String.valueOf(id));
    }

}
