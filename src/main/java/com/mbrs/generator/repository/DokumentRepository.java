package com.mbrs.generator.repository;

import com.mbrs.generator.model.Dokument;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface DokumentRepository extends JpaRepository<Dokument, Long> {

}