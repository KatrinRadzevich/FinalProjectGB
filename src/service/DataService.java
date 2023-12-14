package src.service;

import src.model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.List;

public interface DataService {
    void create(Integer animalId, Integer idInCategory, AnimalsCategory category, AnimalsType type, String name, LocalDate dateOfBirth, PetCommands commands);
   List<Animal> readAllAnimals();
    List<Pet> readPetsOnly();
    List<PackAnimal> readPackAnimalsOnly();
}
