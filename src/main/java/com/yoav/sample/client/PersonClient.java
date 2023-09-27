package com.yoav.sample.client;

import com.yoav.sample.dto.PersonDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@RequiredArgsConstructor
@Service
public class PersonClient {

    private static final String SWAPI_API_URL = "https://swapi.dev/api/people/";

    public PersonDTO get(String id){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(SWAPI_API_URL + id, PersonDTO.class);
    }
}
