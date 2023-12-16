package src.model;

import java.time.LocalDate;

public class Dog extends Pet {
    public Dog(Integer animalId, Integer idInCategory, AnimalsCategory category, AnimalsType type, String name, LocalDate dateOfBirth, PetCommands commands) {
        super(animalId, idInCategory, AnimalsCategory.PET, AnimalsType.DOG, name, dateOfBirth, commands);
    }
}
