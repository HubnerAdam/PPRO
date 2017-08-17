package com.example.ppro.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ppro.model.Lektor;
import com.example.ppro.repository.LektorRepository;

@Service
public class LektorService {

	@Autowired
	private LektorRepository lektorRepository;
	
	public Collection<Lektor> findAllLektori(){
		List<Lektor> lektori = new ArrayList<Lektor>();
		for (Lektor lektor : lektorRepository.findAll()) {
			lektori.add(lektor);
		}
		return lektori;
	}
	
	public void deleteLektor(long id) {
		lektorRepository.delete(id);
	}
	
	
}
