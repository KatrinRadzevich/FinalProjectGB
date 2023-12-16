package src.model;

import java.time.LocalDate;

public class Camel extends PackAnimal {


    public Camel(Integer animalId, Integer idInCategory, AnimalsCategory category, AnimalsType type, String name, LocalDate dateOfBirth, PetCommands commands) {
        super(animalId, idInCategory, AnimalsCategory.PACK_ANIMAL, AnimalsType.CAMEL, name, dateOfBirth, commands);
    }
}
