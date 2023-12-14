package src.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Hamster extends Pet {
    public Hamster(Integer animalId, Integer idInCategory, AnimalsCategory category, AnimalsType type, String name, LocalDate dateOfBirth, PetCommands commands) {
        super(animalId, idInCategory, category, type, name, dateOfBirth, commands);
    }
}
