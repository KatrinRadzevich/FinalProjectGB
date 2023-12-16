package src.model;

import java.time.LocalDate;

public class Horse extends PackAnimal{
    public Horse(Integer animalId, Integer idInCategory, AnimalsCategory category, AnimalsType type, String name, LocalDate dateOfBirth, PetCommands commands) {
        super(animalId, idInCategory, AnimalsCategory.PACK_ANIMAL, AnimalsType.HORSE, name, dateOfBirth, commands);
    }
}
