package com.example.ppro.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ppro.model.Zamestnanec;
import com.example.ppro.repository.ZamestnanecRepository;

@Service
public class ZamestnanecService {

	@Autowired
	private ZamestnanecRepository zamestnanecRepository;
	
	public Collection<Zamestnanec> findAllZamestnanci(){
		List<Zamestnanec> zamestnanci = new ArrayList<Zamestnanec>();
		for (Zamestnanec zamestnanec : zamestnanecRepository.findAll()) {
			zamestnanci.add(zamestnanec);
		}
		return zamestnanci;
	}
	
	public void delete(long id) {
		zamestnanecRepository.delete(id);
	}
	
	public Zamestnanec findOne(long id) {
		return zamestnanecRepository.findOne(id);
	}
	
	public void save(Zamestnanec zamestnanec) {
		zamestnanecRepository.save(zamestnanec);
	}
	
}
