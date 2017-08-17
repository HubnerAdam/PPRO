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


	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "predmet")
	private String predmet;
	
	@Column(name = "obsah")
	private String obsah;
	

	@ManyToOne
    @JoinColumn(name = "kurz_id")
	private Kurz kurz;
    public Kurz getKurz() {
        return kurz;
    }

    public void setKurz(Kurz kurz) {
        this.kurz = kurz;
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	public String getObsah() {
		return obsah;
	}

	public void setObsah(String obsah) {
		this.obsah = obsah;
	} 
	
	
	
	
	
}
