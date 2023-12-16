package src.model;

import java.time.LocalDate;

public class PackAnimal extends Animal{


    public PackAnimal(Integer animalId, Integer idInCategory, AnimalsCategory category, AnimalsType type, String name, LocalDate dateOfBirth, PetCommands commands) {
        super(animalId, idInCategory, AnimalsCategory.PACK_ANIMAL, type, name, dateOfBirth, commands);
    }
}
