package com.example.allanimals.domain.service;

import com.example.allanimals.domain.model.entities.Animal;
import com.example.allanimals.domain.repositories.AnimalRepository;

import java.util.List;

public class AnimalService {

    private AnimalRepository animalRepository;

    public void cadastrarAnimal(Animal animal){
        animalRepository.save(animal);

    }


    public List<Animal> getAllAnimais(){
    List<Animal> result = animalRepository.getAllAnimals();
    return result;
    }

    public void updateAnimal(Animal animal){
        animalRepository.update(animal);
    }

    public void deleteAnimal(Long id){
        animalRepository.delete(id);
    }

}
