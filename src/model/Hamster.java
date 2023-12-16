package src.model;

import java.time.LocalDate;

public class Hamster extends Pet {
    public Hamster(Integer animalId, Integer idInCategory, AnimalsCategory category, AnimalsType type, String name, LocalDate dateOfBirth, PetCommands commands) {
        super(animalId, idInCategory,AnimalsCategory.PET, AnimalsType.HAMSTER, name, dateOfBirth, commands);
    }
}
