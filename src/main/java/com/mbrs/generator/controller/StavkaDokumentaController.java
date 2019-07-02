package com.mbrs.generator.controller;

import com.mbrs.generator.model.StavkaDokumenta;
import com.mbrs.generator.service.StavkaDokumentaService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StavkaDokumentaController {

    @Autowired
    private StavkaDokumentaService stavkaDokumentaService;


    @RequestMapping(
        value    = "api/stavkadokumenta/findAll",
        method   = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Collection<StavkaDokumenta>> findAll() {
        Collection<StavkaDokumenta> allStavkaDokumenta = stavkaDokumentaService.findAll();
        return new ResponseEntity<>(allStavkaDokumenta, HttpStatus.OK);
    }

    @RequestMapping(
        value    = "api/stavkadokumenta/findOne{id}",
        method   = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<StavkaDokumenta> findOne(@PathVariable Long id) {
        StavkaDokumenta stavkaDokumenta = stavkaDokumentaService.findOne(id);
        return new ResponseEntity<>(stavkaDokumenta, HttpStatus.OK);
    }

    @RequestMapping(
        value    = "api/stavkadokumenta/save",
        method   = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<StavkaDokumenta> save(@RequestBody StavkaDokumenta stavkaDokumenta) {
        StavkaDokumenta stavkaDokumentaSaved = stavkaDokumentaService.save(stavkaDokumenta);
        return new ResponseEntity<>(stavkaDokumentaSaved, HttpStatus.OK);
    }

}