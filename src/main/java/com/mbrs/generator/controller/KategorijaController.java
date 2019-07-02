package com.mbrs.generator.controller;

import com.mbrs.generator.model.Kategorija;
import com.mbrs.generator.service.KategorijaService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class KategorijaController {

    @Autowired
    private KategorijaService kategorijaService;


    @RequestMapping(
        value    = "api/kategorija/findAll",
        method   = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Collection<Kategorija>> findAll() {
        Collection<Kategorija> allKategorija = kategorijaService.findAll();
        return new ResponseEntity<>(allKategorija, HttpStatus.OK);
    }

    @RequestMapping(
        value    = "api/kategorija/findOne{id}",
        method   = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Kategorija> findOne(@PathVariable Long id) {
        Kategorija kategorija = kategorijaService.findOne(id);
        return new ResponseEntity<>(kategorija, HttpStatus.OK);
    }

    @RequestMapping(
        value    = "api/kategorija/save",
        method   = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Kategorija> save(@RequestBody Kategorija kategorija) {
        Kategorija kategorijaSaved = kategorijaService.save(kategorija);
        return new ResponseEntity<>(kategorijaSaved, HttpStatus.OK);
    }

}