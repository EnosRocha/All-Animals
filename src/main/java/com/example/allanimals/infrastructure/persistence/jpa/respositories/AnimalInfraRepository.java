package com.example.allanimals.infrastructure.persistence.jpa.respositories;

import com.example.allanimals.infrastructure.persistence.jpa.entities.AnimalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface AnimalInfraRepository extends JpaRepository<AnimalEntity, Long>{



}
