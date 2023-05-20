package org.sid.immatriculation.repository;

import org.sid.immatriculation.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface OwnerRepository extends JpaRepository<Owner,String> {
}
