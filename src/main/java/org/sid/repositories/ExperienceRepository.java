package org.sid.repositories;

import org.sid.entities.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ExperienceRepository extends JpaRepository<Experience, Long>{

}
