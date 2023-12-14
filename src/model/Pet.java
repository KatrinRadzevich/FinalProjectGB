package src.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pet extends Animal{


    public Pet(Integer animalId, Integer idInCategory, AnimalsCategory category, AnimalsType type, String name, LocalDate dateOfBirth, PetCommands commands) {
        super(animalId, idInCategory, category, type, name, dateOfBirth, commands);
    }
}
