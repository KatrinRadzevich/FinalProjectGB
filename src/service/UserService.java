package src.service;

import src.model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserService implements DataService {
    private List<Animal> animalsList = new ArrayList<>();
    private List<Pet> petsList = new ArrayList<>();
    private List<PackAnimal> packAnimalsList = new ArrayList<>();

    @Override
    public void create(Integer animalId, Integer idInCategory, AnimalsCategory category, AnimalsType type, String name, LocalDate dateOfBirth, PetCommands commands) {
        animalId = getFreeAnimalId(animalsList);
        idInCategory = getFreeCategoryId(category);
        if (AnimalsCategory.PET == category) {
            Pet pet = new Pet(animalId, idInCategory, category, type, name, dateOfBirth, commands);
            animalsList.add(pet);
            petsList.add(pet);
        }
        if (AnimalsCategory.PACK_ANIMAL == category) {
            PackAnimal packAnimal = new PackAnimal(animalId, idInCategory, category, type, name, dateOfBirth, commands);
            animalsList.add(packAnimal);
            packAnimalsList.add(packAnimal);
        }
    }

    @Override
    public List<Animal> readAllAnimals () {
        return animalsList;
    }

    @Override
    public List<Pet> readPetsOnly () {
        return petsList;
    }

    @Override
    public List<PackAnimal> readPackAnimalsOnly () {
        return packAnimalsList;
    }

    private int getFreeAnimalId (List<Animal> animalsList){
        int lastId = 0;
        for (Animal animal : animalsList) {
            lastId++;
        }
        return ++lastId;
    }

    private int getFreeCategoryId (AnimalsCategory category){
        int lastId = 0;
        boolean isPet = AnimalsCategory.PET == category;
        for (Animal animal : animalsList) {
            if (animal instanceof PackAnimal && !isPet) {
                lastId++;
            }
            if (animal instanceof Pet && isPet) {
                lastId++;
            }
        }
        return ++lastId;
    }

    public void animalCounter() {
        int counter = 0;
        List<Animal> animals = readAllAnimals();
        for (Animal animal : animals) {
            counter = animal.getAnimalId();
        }
        System.out.println("Всего животных в питомнике: " + counter);
    }

    public void petCounter() {
        int counter = 0;
        List<Pet> pets = readPetsOnly();
        for (Pet pet : pets) {
            counter = pet.getIdInCategory();
        }
        System.out.println("Всего домашних животных в питомнике: " + counter);
    }

    public void packAnimalCounter() {
        int counter = 0;
        List<PackAnimal> packAnimals = readPackAnimalsOnly();
        for (PackAnimal packAnimal : packAnimals) {
            counter = packAnimal.getIdInCategory();
        }
        System.out.println("Всего вьючных животных в питомнике: " + counter);
    }


}
