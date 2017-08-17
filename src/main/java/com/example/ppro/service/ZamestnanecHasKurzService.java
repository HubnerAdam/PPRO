package com.example.ppro.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ppro.model.ZamestnanecHasKurz;
import com.example.ppro.repository.ZamestnanecHasKurzRepository;

@Service
public class ZamestnanecHasKurzService {

	@Autowired
	private ZamestnanecHasKurzRepository zamestnanecHasKurzRepository;
	
	public Collection<ZamestnanecHasKurz> findAllKurzyZamestnancu(){
		List<ZamestnanecHasKurz> zamestnanecHasKurzy = new ArrayList<ZamestnanecHasKurz>();
		for (ZamestnanecHasKurz zamestnanecHasKurz : zamestnanecHasKurzRepository.findAll()) {
			zamestnanecHasKurzy.add(zamestnanecHasKurz);
		}
		return zamestnanecHasKurzy;
	}
	
	public void deleteZamestnanecHasKurz(long id) {
		zamestnanecHasKurzRepository.delete(id);
	}
}
	