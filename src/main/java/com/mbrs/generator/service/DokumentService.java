package com.mbrs.generator.service;

import com.mbrs.generator.model.Dokument;
import com.mbrs.generator.repository.DokumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class DokumentService {

    @Autowired
    private DokumentRepository dokumentRepository;

    public Dokument save(Dokument dokument) {
        return dokumentRepository.save(dokument);
    }

    public Dokument findOne(Long id) {
        return dokumentRepository.findById(id).get();
    }

    public Collection<Dokument> findAll() {
        return dokumentRepository.findAll();
    }

    public void delete(Dokument dokument) {
        dokumentRepository.delete(dokument);
    }

    public void delete(Long id) {
        dokumentRepository.deleteById(id);
    }

}
