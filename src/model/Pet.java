package src.model;

import java.time.LocalDate;

public class Pet extends Animal{


    public Pet(Integer animalId, Integer idInCategory, AnimalsCategory category, AnimalsType type, String name, LocalDate dateOfBirth, PetCommands commands) {
        super(animalId, idInCategory, AnimalsCategory.PET, type, name, dateOfBirth, commands);
    }
}
