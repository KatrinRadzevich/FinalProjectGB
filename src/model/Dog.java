package src.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static src.model.AnimalsCategory.PET;
import static src.model.AnimalsType.DOG;

public class Dog extends Pet {
    public Dog(Integer animalId, Integer idInCategory, AnimalsCategory category, AnimalsType type, String name, LocalDate dateOfBirth, PetCommands commands) {
        super(animalId, idInCategory, category, type, name, dateOfBirth, commands);
    }
}
