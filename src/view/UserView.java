package src.view;

import src.model.Animal;
import src.model.PackAnimal;
import src.model.Pet;

public class UserView {
    public void printAnimal(Animal animal) {
        System.out.println(animal);
    }

    public void printPackAnimal(PackAnimal packAnimal) {
        System.out.println(packAnimal);
    }

    public void printPet(Pet pet) {
        System.out.println(pet);
    }


}
