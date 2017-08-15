package com.example.ppro.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ppro.model.Zamestnanec;
import com.example.ppro.repository.ZamestnanecRepository;

@RestController
public class WebController {
    @Autowired
    ZamestnanecRepository repository;
      
    @RequestMapping("/save")
    public String process(){
        repository.save(new Zamestnanec("Josef", "Novák","Na Valech","Jaroměř", "Mistr", "p.nov@seznam.cz", "728645521"));

        return "Done";
    }
      /* Comment*/
      
    @RequestMapping("/findall")
    public String findAll(){
        String result = "<html>";
          
        for(Zamestnanec cust : repository.findAll()){
            result += "<div>" + cust.toString() + "</div>";
        }
          
        return result + "</html>";
    }
      
    @RequestMapping("/findbyid")
    public String findById(@RequestParam("id") long id){
        String result = "";
        result = repository.findOne(id).toString();
        return result;
    }
      
    @RequestMapping("/findbylastname")
    public String fetchDataByLastName(@RequestParam("prijmeni") String prijmeni){
        String result = "<html>";
          
        for(Zamestnanec cust: repository.findByPrijmeni(prijmeni)){
            result += "<div>" + cust.toString() + "</div>"; 
        }
          
        return result + "</html>";
    }
}