package com.mbrs.generator.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Cenovnik implements Serializable {


  

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
  

  

    
    private String naziv;
  




    public Cenovnik() {}


  
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
  




}