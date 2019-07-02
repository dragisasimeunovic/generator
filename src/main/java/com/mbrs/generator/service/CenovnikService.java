package com.mbrs.generator.service;

import com.mbrs.generator.model.Cenovnik;
import com.mbrs.generator.repository.CenovnikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CenovnikService {

    @Autowired
    private CenovnikRepository cenovnikRepository;

    public Cenovnik save(Cenovnik cenovnik) {
        return cenovnikRepository.save(cenovnik);
    }

    public Cenovnik findOne(Long id) {
        return cenovnikRepository.findById(id).get();
    }

    public Collection<Cenovnik> findAll() {
        return cenovnikRepository.findAll();
    }

    public void delete(Cenovnik cenovnik) {
        cenovnikRepository.delete(cenovnik);
    }

    public void delete(Long id) {
        cenovnikRepository.deleteById(id);
    }

}
