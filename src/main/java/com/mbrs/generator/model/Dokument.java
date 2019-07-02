package com.mbrs.generator.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Dokument implements Serializable {


  

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
  

  

    
    private String naziv;
  

  

    
    private Long broj;
  




    public Dokument() {}


  
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
  

  
    public Long getBroj() {
        return this.broj;
    }

    public void setBroj(Long broj) {
        this.broj = broj;
    }
  




}