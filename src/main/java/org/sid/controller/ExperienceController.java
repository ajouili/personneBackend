package org.sid.controller;

import java.util.List;
import java.util.Optional;

import org.sid.entities.Experience;
import org.sid.entities.Technologie;
import org.sid.repositories.ExperienceRepository;
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
@RequestMapping("/experience")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class ExperienceController {

	@Autowired
	private ExperienceRepository experienceRepository;

	@GetMapping("/experiences")
	public List<Experience> listTechnologies() {
		return experienceRepository.findAll();
	}

	@GetMapping("/experience/{id}")
	public Optional<Experience> getExperienceById(@PathVariable Long id) {
		return experienceRepository.findById(id);
				}
	
	@PostMapping("/experience")
	public Experience createExperience(@RequestBody Experience experience) {
		return experienceRepository.save(experience);
	}

	@DeleteMapping("/experience/{id}")
	public boolean deleteExperience(@PathVariable Long id) {

		experienceRepository.deleteById(id);
		return true;

	}

	@PutMapping("/experience")
	public Experience editExperience(@RequestBody Experience experience) {
		return experienceRepository.save(experience);
	}

}
