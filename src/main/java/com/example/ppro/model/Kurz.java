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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Kurz")
public class Kurz implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Set<Zamestnanec> zamestnanci;
	private Set<HromadnaZprava> hromadneZpravy;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "nazevKurzu")
	private String nazevKurzu;
	
	@Column(name = "popisKurzu")
	private String popisKurzu;	

	java.util.Date dt = new java.util.Date();
	java.text.SimpleDateFormat sdf = 
	     new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String currentTime = sdf.format(dt);
	
	@Column(name = "cas")
	private int cas;
	
	private Lektor lektor;
	@ManyToOne
    @JoinColumn(name = "idLektor")
    public Lektor getLektor() {
        return lektor;
	}
    public void setLektor(Lektor lektor) {
        this.lektor = lektor;
    }
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "zamestnanec", joinColumns = @JoinColumn(name = "zamestnanec_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "kurz_id", referencedColumnName = "id"))
    public Set<Zamestnanec> getZamestnanci() {
        return zamestnanci;
    }

    public void setZamestnanci(Set<Zamestnanec> zamestnanci) {
        this.zamestnanci = zamestnanci;
    }
    
    @OneToMany(mappedBy = "kurz", cascade = CascadeType.ALL)
    public Set<HromadnaZprava> getHromadneZpravy() {
        return hromadneZpravy;
    }

    public void setHromadneZpravy(Set<HromadnaZprava> hromadneZpravy) {
        this.hromadneZpravy = hromadneZpravy;
    }


    
}
