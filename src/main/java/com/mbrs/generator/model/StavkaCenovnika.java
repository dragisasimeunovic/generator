package com.mbrs.generator.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class StavkaCenovnika implements Serializable {


  

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
  

  

    
    private String naziv;
  

  

    
    private Double cena;
  



    private Long cenovnikId;

    private Long stavkaDokumentaId;


    public StavkaCenovnika() {}


  
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
  

  
    public String getNaziv() {
        return this.naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
  

  
    public Double getCena() {
        return this.cena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }
  



    public Long getCenovnikId() {
        return this.cenovnikId;
    }

    public void setCenovnikId(Long cenovnikId) {
        this.cenovnikId = cenovnikId;
    }

    public Long getStavkaDokumentaId() {
        return this.stavkaDokumentaId;
    }

    public void setStavkaDokumentaId(Long stavkaDokumentaId) {
        this.stavkaDokumentaId = stavkaDokumentaId;
    }


}