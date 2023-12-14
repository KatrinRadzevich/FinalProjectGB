package src.controller;

import src.model.*;
import src.service.UserService;
import src.view.UserView;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;


public class Controller {

    private final UserService userService = new UserService();
    private final UserView userView = new UserView();
    private Scanner scanner = new Scanner(System.in);

    public void createAnimal(Integer animalId, Integer idInCategory, AnimalsCategory category, AnimalsType type, String name, LocalDate dateOfBirth, PetCommands commands) {
        userService.create(animalId,idInCategory,category,type,name, dateOfBirth,commands);
    }

    public void menuStart() {
        System.out.println("Добро пожаловать в наш питомник :)");
        int menuNumber = 1;
        while (menuNumber != 0) {
            System.out.println("\nВыберите пожалуйста взаимодействие с платформой:" +
                    "\n1.посмотреть список животных" +
                    "\n2.добавить новое животное" +
                    "\n3.посмотреть имеющиеся команды???" +
                    "\n4.добавление новой команды животному" +
                    "\n5.показать список животных по дате рождения" +
                    "\n6.показать общее количество животных" +
                    "\n0.выход");
            menuNumber = scanner.nextInt();
            if (menuNumber == 1) {
                choiceOfAnimalCategory();
            }
//        if (menuNumber == 2) {
//            System.out.println("\nКакого животного вы хотите добавить? 1.все, 2.домашние, 3.вьючные");
//            createNewAnimal()???вопрос по коммандам;
//        }
//        if (menuNumber == 3) {
//            System.out.println("\nКакие животные вас интересуют? 1.все, 2.домашние, 3.вьючные");
//            choiceOfAnimalCategory();
//        }
//        if (menuNumber == 4) {
//            System.out.println("\nКакие животные вас интересуют? 1.все, 2.домашние, 3.вьючные");
//            choiceOfAnimalCategory();
//        }
//        if (menuNumber == 5) {
//            System.out.println("\nКакие животные вас интересуют? 1.все, 2.домашние, 3.вьючные");
//            showAnimals();???сортировка по дате рождения
//        }
        if (menuNumber == 6) {
            showAnimalCounter();
        }
        }

//        if (Integer.valueOf(menuNumber).equals(2)) {
//            System.out.println("Ok, have a good day! :)");
//        }
//        if (!Integer.valueOf(menuNumber).equals(1) && !Integer.valueOf(menuNumber).equals(2)) {
//            System.out.println("Something went wrong... Try again later");
//        }
//        System.out.println("Thank you for the play :)");
    }
    public void choiceOfAnimalCategory(){
        System.out.println("\nКакие животные вас интересуют? 1.все, 2.домашние, 3.вьючные");
        int menuNumber = scanner.nextInt();
        if (menuNumber == 1) {
            List<Animal> animals = userService.readAllAnimals();
            for (Animal animal : animals) {
                userView.printAnimal(animal);
            }
        }
        if (menuNumber == 2) {
            List<Pet> pets = userService.readPetsOnly();
            for (Pet pet : pets) {
                userView.printPet(pet);
            }
        }
        if (menuNumber == 3) {
            List<PackAnimal> packAnimals = userService.readPackAnimalsOnly();
            for (PackAnimal packAnimal : packAnimals) {
                userView.printPackAnimal(packAnimal);
            }
        }
    }

    public void showAnimalCounter(){
        System.out.println("\nКакие животные вас интересуют? 1.все, 2.домашние, 3.вьючные");
        int menuNumber = scanner.nextInt();
        if (menuNumber == 1) {
            userService.animalCounter();
        }
        if (menuNumber == 2) {
            userService.petCounter();
        }
        if (menuNumber == 3) {
         userService.packAnimalCounter();
        }
    }
//    public void showAnimals(){
//        System.out.println("\nКакие животные вас интересуют? 1.все, 2.домашние, 3.вьючные");
//        int menuNumber = scanner.nextInt();
//        if (menuNumber == 1) {
//            List<Animal> animals = userService.readAllAnimals();
//            for (Animal animal : animals) {
//                animal.getDateOfBirth();???сортировка по дате рождения
//            }
//        }
//        if (menuNumber == 2) {
//            List<Pet> pets = userService.readPetsOnly();
//            for (Pet pet : pets) {
//                userView.printPet(pet);
//            }
//        }
//        if (menuNumber == 3) {
//            List<PackAnimal> packAnimals = userService.readPackAnimalsOnly();
//            for (PackAnimal packAnimal : packAnimals) {
//                userView.printPackAnimal(packAnimal);
//            }
//        }
//        userService.readAllAnimals();
//    }






//    public void getAllAnimals() {
//
//    }
//
//    public void getPetsOnly() {
//
//    }
//
//    public void getPackAnimalsOnly() {
//        List<PackAnimal> packAnimals = userService.readPackAnimalsOnly();
//        for (PackAnimal packAnimal : packAnimals) {
//            userView.printPackAnimal(packAnimal);
//        }
//    }

}
