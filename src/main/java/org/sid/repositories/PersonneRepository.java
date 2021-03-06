package org.sid.repositories;

import org.sid.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface PersonneRepository extends JpaRepository<Personne, Long>{

}
