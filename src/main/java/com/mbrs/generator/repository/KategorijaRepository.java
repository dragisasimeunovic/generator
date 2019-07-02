package com.mbrs.generator.repository;

import com.mbrs.generator.model.Kategorija;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface KategorijaRepository extends JpaRepository<Kategorija, Long> {

}