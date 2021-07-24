package pl.patryklubik.datacreator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.patryklubik.datacreator.model.Data;
import pl.patryklubik.datacreator.model.DataRepository;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;


/**
 * Create by Patryk Łubik on 24.07.2021.
 */

@RestController
@RequestMapping("/data")
public class DataController {

    private final DataRepository repository;

    public DataController(DataRepository repository) {
        this.repository = repository;
    }


    @PostMapping()
    ResponseEntity<Data> createData(@RequestBody @Valid Data toCreate) {
        Data result = repository.save(toCreate);
        return ResponseEntity.created(URI.create("/" + result.getId())).body(result);
    }

    @GetMapping(value = "/{id}")
    ResponseEntity<Data> getData(@PathVariable int id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping()
    ResponseEntity<List<Data>> getAllData () {

        return ResponseEntity.ok(repository.findAll());
    }
}

