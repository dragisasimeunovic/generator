package com.mbrs.generator.controller;

import com.mbrs.generator.model.StavkaCenovnika;
import com.mbrs.generator.service.StavkaCenovnikaService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StavkaCenovnikaController {

    @Autowired
    private StavkaCenovnikaService stavkaCenovnikaService;


    @RequestMapping(
        value    = "api/stavkacenovnika/findAll",
        method   = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Collection<StavkaCenovnika>> findAll() {
        Collection<StavkaCenovnika> allStavkaCenovnika = stavkaCenovnikaService.findAll();
        return new ResponseEntity<>(allStavkaCenovnika, HttpStatus.OK);
    }

    @RequestMapping(
        value    = "api/stavkacenovnika/findOne{id}",
        method   = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<StavkaCenovnika> findOne(@PathVariable Long id) {
        StavkaCenovnika stavkaCenovnika = stavkaCenovnikaService.findOne(id);
        return new ResponseEntity<>(stavkaCenovnika, HttpStatus.OK);
    }

    @RequestMapping(
        value    = "api/stavkacenovnika/save",
        method   = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<StavkaCenovnika> save(@RequestBody StavkaCenovnika stavkaCenovnika) {
        StavkaCenovnika stavkaCenovnikaSaved = stavkaCenovnikaService.save(stavkaCenovnika);
        return new ResponseEntity<>(stavkaCenovnikaSaved, HttpStatus.OK);
    }

}