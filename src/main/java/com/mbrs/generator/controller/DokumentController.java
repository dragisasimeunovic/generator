package com.mbrs.generator.controller;

import com.mbrs.generator.model.Dokument;
import com.mbrs.generator.service.DokumentService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class DokumentController {

    @Autowired
    private DokumentService dokumentService;


    @RequestMapping(
        value    = "api/dokument/findAll",
        method   = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Collection<Dokument>> findAll() {
        Collection<Dokument> allDokument = dokumentService.findAll();
        return new ResponseEntity<>(allDokument, HttpStatus.OK);
    }

    @RequestMapping(
        value    = "api/dokument/findOne{id}",
        method   = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Dokument> findOne(@PathVariable Long id) {
        Dokument dokument = dokumentService.findOne(id);
        return new ResponseEntity<>(dokument, HttpStatus.OK);
    }

    @RequestMapping(
        value    = "api/dokument/save",
        method   = RequestMethod.POST,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Dokument> save(@RequestBody Dokument dokument) {
        Dokument dokumentSaved = dokumentService.save(dokument);
        return new ResponseEntity<>(dokumentSaved, HttpStatus.OK);
    }

}