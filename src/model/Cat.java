package src.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static src.model.AnimalsCategory.PET;

public class Cat extends Pet {

    public Cat(Integer animalId, Integer idInCategory, AnimalsCategory category, AnimalsType type, String name, LocalDate dateOfBirth, PetCommands commands) {
        super(animalId, idInCategory, category, type, name, dateOfBirth, commands);
    }
}
