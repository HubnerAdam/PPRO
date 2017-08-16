package com.example.ppro.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "hromadnaZprava")
public class HromadnaZprava implements Serializable{

	private static final long serialVersionUID = 1L;

	private Kurz kurz;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "predmet")
	private String predmet;
	
	@Column(name = "obsah")
	private String obsah;
	
	/*
	@ManyToOne
    @JoinColumn(name = "kurz_id")
    public Kurz getKurz() {
        return kurz;
    }

    public void setKurz(Kurz kurz) {
        this.kurz = kurz;
    } */
	
	
	
	
	
}
