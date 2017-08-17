package com.example.ppro.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ppro.model.HromadnaZprava;
import com.example.ppro.repository.HromadnaZpravaRepository;


@Service
public class HromadnaZpravaService {

	@Autowired
	private HromadnaZpravaRepository hromadnaZpravaRepository;
	
	public Collection<HromadnaZprava> findAllHromadneZpravy(){
		List<HromadnaZprava> hromadneZpravy = new ArrayList<HromadnaZprava>();
		for (HromadnaZprava hromadnaZprava : hromadnaZpravaRepository.findAll()) {
			hromadneZpravy.add(hromadnaZprava);
		}
		return hromadneZpravy;
	}
	
	public void deleteHromadnaZprava(long id) {
		hromadnaZpravaRepository.delete(id);
	}
	
}
