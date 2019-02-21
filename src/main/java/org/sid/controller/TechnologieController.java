package org.sid.controller;

import java.util.List;

import org.sid.entities.Technologie;
import org.sid.repositories.TechnologieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("technologie")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class TechnologieController {
	
	@Autowired
	private TechnologieRepository technologieRepository;
	
	@GetMapping("technologies")
	public List<Technologie> getTechnologies(){
		return technologieRepository.findAll();
	}
	
	@PostMapping("/technologie")
	public Technologie addTechnologie(@RequestBody Technologie technologie) {
		return technologieRepository.save(technologie);
	}

}
