package org.sid.repositories;

import org.sid.entities.Technologie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface TechnologieRepository extends JpaRepository<Technologie, Long>{

}
