package com.mbrs.generator.service;

import com.mbrs.generator.model.StavkaDokumenta;
import com.mbrs.generator.repository.StavkaDokumentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StavkaDokumentaService {

    @Autowired
    private StavkaDokumentaRepository stavkaDokumentaRepository;

    public StavkaDokumenta save(StavkaDokumenta stavkaDokumenta) {
        return stavkaDokumentaRepository.save(stavkaDokumenta);
    }

    public StavkaDokumenta findOne(Long id) {
        return stavkaDokumentaRepository.findById(id).get();
    }

    public Collection<StavkaDokumenta> findAll() {
        return stavkaDokumentaRepository.findAll();
    }

    public void delete(StavkaDokumenta stavkaDokumenta) {
        stavkaDokumentaRepository.delete(stavkaDokumenta);
    }

    public void delete(Long id) {
        stavkaDokumentaRepository.deleteById(id);
    }

}
