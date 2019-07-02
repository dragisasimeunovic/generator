package com.mbrs.generator.repository;

import com.mbrs.generator.model.Cenovnik;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface CenovnikRepository extends JpaRepository<Cenovnik, Long> {

}