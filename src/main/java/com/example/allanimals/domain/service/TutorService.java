package com.example.allanimals.domain.service;

import com.example.allanimals.domain.exceptions.TutorException;
import com.example.allanimals.domain.model.entities.Animal;
import com.example.allanimals.domain.model.entities.Tutor;
import com.example.allanimals.domain.repositories.TutorRepository;

import java.util.List;

public class TutorService {

    private final TutorRepository tutorRepository;

    public TutorService(TutorRepository tutorRepository) {
        this.tutorRepository = tutorRepository;
    }

    public void cadastrarTutor(Tutor tutor) {
        tutorRepository.save(tutor);

    }


    public List<Tutor> getAllTutors() {
        List<Tutor> result = tutorRepository.getAllTutors();

        if (result == null || result.equals("") || result.equals("undefined")) {
            throw new TutorException("Nenhum tutor encontrado");
        }

        return result;
    }

    public void updateTutor(Tutor tutor) {
        tutorRepository.update(tutor);
    }


    public void deleteTutor(Long id) {
        tutorRepository.delete(id);
    }
}
