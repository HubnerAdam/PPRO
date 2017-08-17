package com.example.ppro.model;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 
@Entity
@Table(name = "lektor")
public class Lektor implements Serializable{

	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "jmeno")
	private String jmeno;
	
	@Column(name = "prijmeni")
	private String prijmeni;
	
	@Column(name = "login")
	private String login;
	
	@Column(name = "heslo")
	private String heslo;
	
	@Column(name = "ulice")
	private String ulice;
 
	@Column(name = "mesto")
	private String mesto;
	
	@Column(name = "pozice")
	private String pozice;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "telefon")
	private String telefon;


    @OneToMany(mappedBy = "lektor", cascade = CascadeType.ALL)
    private Set<Kurz> kurzy;
    public Set<Kurz> getKurzy() {
        return kurzy;
    }
   public void setKurzy(Set<Kurz> kurzy) {
        this.kurzy = kurzy;
    }
 
	protected Lektor() {
	}

	public Lektor(String jmeno, String prijmeni, String login, String heslo, String ulice, String mesto, 
			String pozice, String email, String telefon
			) {
		this.jmeno = jmeno;
		this.prijmeni = prijmeni;
		this.login = login;
		this.heslo = heslo;
		this.ulice = ulice;
		this.mesto = mesto;
		this.pozice = pozice;
		this.email = email;
		this.telefon = telefon;
	}
 
	@Override
	public String toString() {
		return String.format("Zamestnanec[id=%d, jmeno='%s', prijmeni='%s','login=%s', 'heslo=%s', ulice='%s',"
				+ "mesto='%s',pozice='%s',email='%s',telefon='%s',]", id, jmeno, prijmeni, login, heslo,
				ulice, mesto, pozice, email, telefon);
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getJmeno() {
		return jmeno;
	}
	public void setJmeno(String jmeno) {
		this.jmeno = jmeno;
	}
	public String getPrijmeni() {
		return prijmeni;
	}
	public void setPrijmeni(String prijmeni) {
		this.prijmeni = prijmeni;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getHeslo() {
		return heslo;
	}
	public void setHeslo(String heslo) {
		this.heslo = heslo;
	}
	public String getUlice() {
		return ulice;
	}
	public void setUlice(String ulice) {
		this.ulice = ulice;
	}
	public String getMesto() {
		return mesto;
	}
	public void setMesto(String mesto) {
		this.mesto = mesto;
	}
	public String getPozice() {
		return pozice;
	}
	public void setPozice(String pozice) {
		this.pozice = pozice;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	
	
	
	
}
