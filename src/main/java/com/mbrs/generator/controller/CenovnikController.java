package com.mbrs.generator.controller;

import com.mbrs.generator.model.Cenovnik;
import com.mbrs.generator.service.CenovnikService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CenovnikController {

    @Autowired
    private CenovnikService cenovnikService;


    @RequestMapping(
        value    = "api/cenovnik/findAll",
        method   = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Collection<Cenovnik>> findAll() {
        Collection<Cenovnik> allCenovnik = cenovnikService.findAll();
        return new ResponseEntity<>(allCenovnik, HttpStatus.OK);
    }

    @RequestMapping(
        value    = "api/cenovnik/findOne{id}",
        method   = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Cenovnik> findOne(@PathVariable Long id) {
        Cenovnik cenovnik = cenovnikService.findOne(id);
        return new ResponseEntity<>(cenovnik, HttpStatus.OK);
    }

    @RequestMapping(
        value    = "api/cenovnik/save",
        method   = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Cenovnik> save(@RequestBody Cenovnik cenovnik) {
        Cenovnik cenovnikSaved = cenovnikService.save(cenovnik);
        return new ResponseEntity<>(cenovnikSaved, HttpStatus.OK);
    }

}