package com.mbrs.generator.service;

import com.mbrs.generator.model.Kategorija;
import com.mbrs.generator.repository.KategorijaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class KategorijaService {

    @Autowired
    private KategorijaRepository kategorijaRepository;

    public Kategorija save(Kategorija kategorija) {
        return kategorijaRepository.save(kategorija);
    }

    public Kategorija findOne(Long id) {
        return kategorijaRepository.findById(id).get();
    }

    public Collection<Kategorija> findAll() {
        return kategorijaRepository.findAll();
    }

    public void delete(Kategorija kategorija) {
        kategorijaRepository.delete(kategorija);
    }

    public void delete(Long id) {
        kategorijaRepository.deleteById(id);
    }

}
