package com.mbrs.generator.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class Kategorija implements Serializable {


  

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
  

  

    
    private String naziv;
  



    private Long stavkaCenovnikaId;


    public Kategorija() {}


  
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
  



    public Long getStavkaCenovnikaId() {
        return this.stavkaCenovnikaId;
    }

    public void setStavkaCenovnikaId(Long stavkaCenovnikaId) {
        this.stavkaCenovnikaId = stavkaCenovnikaId;
    }


}