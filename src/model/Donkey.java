package src.model;

import java.time.LocalDate;

public class Donkey extends PackAnimal{
    public Donkey(Integer animalId, Integer idInCategory, AnimalsCategory category, AnimalsType type, String name, LocalDate dateOfBirth, PetCommands commands) {
        super(animalId, idInCategory,AnimalsCategory.PACK_ANIMAL, AnimalsType.DONKEY, name, dateOfBirth, commands);
    }
}
