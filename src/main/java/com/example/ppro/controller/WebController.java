package com.example.ppro.controller;


import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ppro.model.HromadnaZprava;
import com.example.ppro.model.Kurz;
import com.example.ppro.model.Lektor;
import com.example.ppro.model.Zamestnanec;
import com.example.ppro.model.ZamestnanecHasKurz;
import com.example.ppro.repository.HromadnaZpravaRepository;
import com.example.ppro.repository.KurzRepository;
import com.example.ppro.repository.LektorRepository;
import com.example.ppro.repository.ZamestnanecHasKurzRepository;
import com.example.ppro.repository.ZamestnanecRepository;
import com.example.ppro.service.HromadnaZpravaService;
import com.example.ppro.service.KurzService;
import com.example.ppro.service.LektorService;
import com.example.ppro.service.ZamestnanecHasKurzService;
import com.example.ppro.service.ZamestnanecService;

@RestController
public class WebController {
    @Autowired
    ZamestnanecRepository zamestnanecRepository;   
    
    @Autowired
    LektorRepository lektorRepository;
    
    @Autowired
    KurzRepository kurzRepository;
    
    @Autowired
    HromadnaZpravaRepository hromadnaZpravaRepository;
    
    @Autowired
    ZamestnanecHasKurzRepository zamestnanecHasKurzRepository;
    
    @Autowired
    ZamestnanecService zamestnanecService;
    
    @Autowired
    LektorService lektorService;
    
    @Autowired
    KurzService kurzService;
    
    @Autowired
    HromadnaZpravaService hromadnaZpravaService;
    
    @Autowired
    ZamestnanecHasKurzService zamestnanecHasKurzService;
    
    
    /*
    @RequestMapping("/save")
    public String process(){
        zamestnanecRepository.save(new Zamestnanec("Josef", "Novák","NovaJose", "Heslo123","Na Valech","Jaroměř", "Mistr", "p.nov@seznam.cz", "728645521"));
        zamestnanecRepository.save(new Zamestnanec("Karel", "Novák","NovaKare", "Heslo123","Na Valech","Jaroměř", "Mistr", "p.nov@seznam.cz", "728645521"));

        return "Done";
<<<<<<< HEAD
    }
      
=======
    } */
      /* Comment*/

      
    @RequestMapping("/saveK")
    public String process(){
        kurzRepository.save(new Kurz("PPRO", "Práce v Spring","Úterý 19:00", 30));
        //lektorRepository.save(new Lektor("Karel", "Novák","NovaKare", "Heslo123","Na Valech","Jaroměř", "Mistr", "p.nov@seznam.cz", "728645521"));

        return "Done";
    }
    
    @RequestMapping("/findall")
    public String findAll(){
        String result = "<html>";
          
        for(Zamestnanec cust : zamestnanecRepository.findAll()){
            result += "<div>" + cust.toString() + "</div>";
        }
          
        return result + "</html>";
    }
      
    @RequestMapping("/findbyid")
    public String findById(@RequestParam("id") long id){
        String result = "";
        result = zamestnanecRepository.findOne(id).toString();
        return result;
    }
      
    @RequestMapping("/findbylastname")
    public String fetchDataByLastName(@RequestParam("prijmeni") String prijmeni){
        String result = "<html>";
          
        for(Zamestnanec cust: zamestnanecRepository.findByPrijmeni(prijmeni)){
            result += "<div>" + cust.toString() + "</div>"; 
        }
          
        return result + "</html>";
    }
    
    @GetMapping("/findAllZamestnanci")
    public Collection<Zamestnanec> getAllZamestnanci(){
    	return zamestnanecService.findAllZamestnanci();
    }
    /*
    @GetMapping("/deleteZamestnanec")
    public void deleteZamestnanec(@RequestParam long id) {
    	zamestnanecService.deleteZamestnanec(id);
    }*/
    
    @GetMapping("/findAllLektori")
    public Collection<Lektor> getAllLektori(){
    	return lektorService.findAllLektori();
    }
    /*
    @GetMapping("/deleteLektor")
    public void deleteLektor(@RequestParam long id) {
    	lektorService.deleteLektor(id);
    }*/
    
    @GetMapping("/findAllKurzy")
    public Collection<Kurz> getAllKurzy(){
    	return kurzService.findAllKurzy();
    }
    
   /* @GetMapping("/deleteKurz")
    public void deleteKurz(@RequestParam long id) {
    	kurzService.deleteKurz(id);
    }*/
    @GetMapping("/findAllHromadneZpravy")
    public Collection<HromadnaZprava> getAllHromadneZpravy(){
    	return hromadnaZpravaService.findAllHromadneZpravy();
    }
    
    @GetMapping("/deleteHromadnaZprava")
    public void deleteHromadnaZprava(@RequestParam long id) {
    	hromadnaZpravaService.deleteHromadnaZprava(id);
    }
    
    @GetMapping("/findAllKurzyZamestnancu")
    public Collection<ZamestnanecHasKurz> getAllKurzyZamestnancu(){
    	return zamestnanecHasKurzService.findAllKurzyZamestnancu();
    }
    
    @GetMapping("/deleteKurzyZamestnance")
    public void deleteKurzyZamestnance(@RequestParam long id) {
    	zamestnanecHasKurzService.deleteZamestnanecHasKurz(id);
    }
    
    
}