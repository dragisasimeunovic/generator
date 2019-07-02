package com.mbrs.generator.service;

import com.mbrs.generator.model.StavkaCenovnika;
import com.mbrs.generator.repository.StavkaCenovnikaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StavkaCenovnikaService {

    @Autowired
    private StavkaCenovnikaRepository stavkaCenovnikaRepository;

    public StavkaCenovnika save(StavkaCenovnika stavkaCenovnika) {
        return stavkaCenovnikaRepository.save(stavkaCenovnika);
    }

    public StavkaCenovnika findOne(Long id) {
        return stavkaCenovnikaRepository.findById(id).get();
    }

    public Collection<StavkaCenovnika> findAll() {
        return stavkaCenovnikaRepository.findAll();
    }

    public void delete(StavkaCenovnika stavkaCenovnika) {
        stavkaCenovnikaRepository.delete(stavkaCenovnika);
    }

    public void delete(Long id) {
        stavkaCenovnikaRepository.deleteById(id);
    }

}
