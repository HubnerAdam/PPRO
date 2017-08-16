package com.example.ppro.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "zamestnanecHasKurz")
public class ZamestnanecHasKurz implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@MapsId("kurz_id")
	@ManyToOne
    @JoinColumn(name = "kurz_id")
	private Kurz kurz;
    public Kurz getKurz() {
        return kurz;
    }
    public void setKurz(Kurz kurz) {
        this.kurz = kurz;
    } 
	@MapsId("zamestnanec_id")
	@ManyToOne
    @JoinColumn(name = "zamestnanec_id")
	private Zamestnanec zamestnanec;
    public Zamestnanec getZamestnanec() {
        return zamestnanec;
    }
    public void setZamestnanec(Zamestnanec zamestnanec) {
        this.zamestnanec = zamestnanec;
    } 
	
	
	
}
