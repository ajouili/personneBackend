package org.sid.controller;

import java.util.List;
import java.util.Optional;

import org.sid.entities.Personne;
import org.sid.repositories.PersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/personne")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class PersonneController {

	@Autowired
	private PersonneRepository personneRepository;

	@GetMapping("/personnes")
	public List<Personne> getPersonnes() {
		return personneRepository.findAll();
	}

	@GetMapping("/personne/{id}")
	public Optional<Personne> getPersonner(@PathVariable Long id) {
		return personneRepository.findById(id);
	}

	@DeleteMapping("/personne/{id}")
	public boolean deletePersonne(@PathVariable Long id) {
		personneRepository.deleteById(id);
		return true;
	}

	@PostMapping("/personne")
	public Personne createPersonne(@RequestBody Personne personne) {
		return personneRepository.save(personne);

	}

	@PutMapping("/personne")
	public Personne updatePersonne(@RequestBody Personne personne) {
		return personneRepository.save(personne);

	}

}
