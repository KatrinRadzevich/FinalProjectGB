package src.model;


import java.time.LocalDate;
import java.time.Month;

public abstract class Animal {
    Integer AnimalId;
    Integer idInCategory;
    AnimalsCategory category;
    AnimalsType type;
    String name;
    LocalDate dateOfBirth;
    PetCommands commands;


    public Animal(Integer animalId, Integer idInCategory, AnimalsCategory category, AnimalsType type, String name, LocalDate dateOfBirth, PetCommands commands) {
        AnimalId = animalId;
        this.idInCategory = idInCategory;
        this.category = category;
        this.type = type;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.commands = commands;
    }

    public Integer getAnimalId() {
        return AnimalId;
    }

    public void setAnimalId(Integer animalId) {
        AnimalId = animalId;
    }

    public Integer getIdInCategory() {
        return idInCategory;
    }

    public void setIdInCategory(Integer idInCategory) {
        this.idInCategory = idInCategory;
    }

    public AnimalsCategory getCategory() {
        return category;
    }

    public void setCategory(AnimalsCategory category) {
        this.category = category;
    }

    public AnimalsType getType() {
        return type;
    }

    public void setType(AnimalsType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public PetCommands getCommands() {
        return commands;
    }

    public void setCommands(PetCommands commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "AnimalId=" + AnimalId +
                ", idInCategory=" + idInCategory +
                ", category=" + category +
                ", type=" + type +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", commands=" + commands +
                '}';
    }
}