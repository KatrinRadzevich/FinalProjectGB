package src.model;

import java.time.LocalDate;

public class Cat extends Pet {

    public Cat(Integer animalId, Integer idInCategory, AnimalsCategory category, AnimalsType type, String name, LocalDate dateOfBirth, PetCommands commands) {
        super(animalId, idInCategory, AnimalsCategory.PET, AnimalsType.CAT, name, dateOfBirth, commands);
    }
}
