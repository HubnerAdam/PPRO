package com.example.ppro.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.ppro.model.Zamestnanec;


public interface ZamestnanecRepository extends CrudRepository<Zamestnanec, Long>{
    List<Zamestnanec> findByPrijmeni(String prijmeni);
}

