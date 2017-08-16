package com.example.ppro.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
 
@Entity
@Table(name = "zamestnanec")
public class Zamestnanec implements Serializable{

	private static final long serialVersionUID = 1L;
	
	//private Set<Kurz>kurzy;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	/*Jen zkouším GIT*/
	
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
	
   /* @ManyToMany(mappedBy = "publishers")
    public Set<Kurz> getKurzy() {
        return kurzy;
    }

    public void setKurzy(Set<Kurz> kurzy) {
        this.kurzy = kurzy;
    } */
 
	protected Zamestnanec() {
	}
 
	public Zamestnanec(String jmeno, String prijmeni, String login, String heslo, String ulice, String mesto, 
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
		return String.format("Zamestnanec[idZamestnanec=%d, jmeno='%s', prijmeni='%s','login=%s', 'heslo=%s', ulice='%s',"
				+ "mesto='%s',pozice='%s',email='%s',telefon='%s',]", id, jmeno, prijmeni, login, heslo,
				ulice, mesto, pozice, email, telefon);
	}
	
	
}
