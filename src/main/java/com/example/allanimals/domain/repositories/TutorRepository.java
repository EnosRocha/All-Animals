package com.example.allanimals.domain.repositories;

import com.example.allanimals.domain.model.entities.Animal;
import com.example.allanimals.domain.model.entities.Tutor;

import java.util.List;

public interface TutorRepository {

    void save(Tutor tutor);
    void delete(Long id);
    Tutor update(Tutor tutor);
    List<Tutor> getAllTutors();
    Tutor getTutor(Long id);
}
