package com.example.ppro.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Kurz")
public class Kurz implements Serializable{

	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "nazevKurzu")
	private String nazevKurzu;
	
	@Column(name = "popisKurzu")
	private String popisKurzu;	
/*
	java.util.Date dt = new java.util.Date();
	java.text.SimpleDateFormat sdf = 
	     new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String currentTime = sdf.format(dt);*/
	
	@Column(name = "cas")
	private String cas;
	
	@Column(name = "kapacita")
	private int kapacita;


	@ManyToOne
    @JoinColumn(name = "idLektor")
	private Lektor lektor;
    public Lektor getLektor() {
        return lektor;
	}
    public void setLektor(Lektor lektor) {
        this.lektor = lektor;
    }
    
    
    @OneToMany(mappedBy = "kurz", cascade = CascadeType.ALL)
	private Set<ZamestnanecHasKurz> zamestnanecHasKurzy;
    public Set<ZamestnanecHasKurz> getZamestnanecHasKurzy() {
        return zamestnanecHasKurzy;
    }
    public void setZamestnanecHasKurzy(Set<ZamestnanecHasKurz> zamestnanecHasKurzy) {
        this.zamestnanecHasKurzy = zamestnanecHasKurzy;
    }
    
    @OneToMany(mappedBy = "kurz", cascade = CascadeType.ALL)
	private Set<HromadnaZprava> hromadneZpravy;
    public Set<HromadnaZprava> getHromadneZpravy() {
        return hromadneZpravy;
    }

    public void setHromadneZpravy(Set<HromadnaZprava> hromadneZpravy) {
        this.hromadneZpravy = hromadneZpravy;
    }
    
	protected Kurz() {
	}
    
    public Kurz(String nazevKurzu, String popisKurzu, String cas, int kapacita
			) {
		this.nazevKurzu = nazevKurzu;
		this.popisKurzu = popisKurzu;
		this.cas = cas;
		this.kapacita = kapacita;
	}
    
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNazevKurzu() {
		return nazevKurzu;
	}
	public void setNazevKurzu(String nazevKurzu) {
		this.nazevKurzu = nazevKurzu;
	}
	public String getPopisKurzu() {
		return popisKurzu;
	}
	public void setPopisKurzu(String popisKurzu) {
		this.popisKurzu = popisKurzu;
	}
	public String getCas() {
		return cas;
	}
	public void setCas(String cas) {
		this.cas = cas;
	}
	
	public int getKapacita() {
		return kapacita;
	}
	public void setKapacita(int kapacita) {
		this.kapacita = kapacita;
	}


    
}
