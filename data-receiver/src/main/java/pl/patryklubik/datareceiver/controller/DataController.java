package pl.patryklubik.datareceiver.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import pl.patryklubik.datareceiver.model.DataDto;


/**
 * Create by Patryk Łubik on 24.07.2021.
 */

@RestController
@RequestMapping("/data")
public class DataController {

    private final RestTemplate restTemplate;
    private final static String URL_PART = "http://localhost:8080/data/";

    public DataController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/{id}")
    ResponseEntity<DataDto> getData (@PathVariable int id) {
        try {
            DataDto data = restTemplate.exchange(URL_PART + id, HttpMethod.GET, HttpEntity.EMPTY, DataDto.class).getBody();
            return ResponseEntity.ok(data);

        } catch(Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}

