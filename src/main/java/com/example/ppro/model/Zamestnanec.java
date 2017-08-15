package com.example.ppro.model;

import java.io.Serializable;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "zamestnanec")
public class Zamestnanec implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	/*Jen zkouším GIT*/
	
	@Column(name = "jmeno")
	private String jmeno;
	
	@Column(name = "prijmeni")
	private String prijmeni;
	
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
 
	protected Zamestnanec() {
	}
 
	public Zamestnanec(String jmeno, String prijmeni, String ulice, String mesto, 
			String pozice, String email, String telefon
			) {
		this.jmeno = jmeno;
		this.prijmeni = prijmeni;
		this.ulice = ulice;
		this.mesto = mesto;
		this.pozice = pozice;
		this.email = email;
		this.telefon = telefon;
	}
 
	@Override
	public String toString() {
		return String.format("Zamestnanec[id=%d, jmeno='%s', prijmeni='%s',ulice='%s',"
				+ "mesto='%s',pozice='%s',email='%s',telefon='%s',]", id, jmeno, prijmeni,
				ulice, mesto, pozice, email, telefon);
	}
	
	
}
