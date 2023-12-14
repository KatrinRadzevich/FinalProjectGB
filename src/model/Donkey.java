package src.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static src.model.AnimalsCategory.PACK_ANIMAL;
import static src.model.AnimalsCategory.PET;
import static src.model.AnimalsType.CAMEL;
import static src.model.AnimalsType.DONKEY;

public class Donkey extends PackAnimal{
    public Donkey(Integer animalId, Integer idInCategory, AnimalsCategory category, AnimalsType type, String name, LocalDate dateOfBirth, PetCommands commands) {
        super(animalId, idInCategory, category, type, name, dateOfBirth, commands);
    }
}
