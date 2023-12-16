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
    private final PetCommands petCommands = new PetCommands();
    private Scanner scanner = new Scanner(System.in);

    public void createAnimal(Integer animalId, Integer idInCategory, AnimalsCategory category, AnimalsType type, String name, LocalDate dateOfBirth, PetCommands commands) {
        userService.createAnimal(animalId,idInCategory,category,type,name, dateOfBirth,commands);
    }
    /**
     *   9.5. Навигация по меню. Консольный пользовательский интерфейс с меню для навигации
     */
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
            if (menuNumber == 2) {
                createNewAnimal();
            }
            if (menuNumber == 3) {
                petCommands.PetCommands();
            }
            if (menuNumber == 4) {
               addNewCommand();
            }
            if (menuNumber == 5) {
                animalsByDateOfBirth();
            }
            if (menuNumber == 6) {
                showAnimalCounter();
            }
        }

    }
    /**
     *   вывод всех животных по категориям
     */
    public void choiceOfAnimalCategory () {
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

/**
 *   9.1. Добавление нового животного
 */

    public void createNewAnimal(){
        System.out.println("\nКакого животного вы хотите добавить? 1.верблюд, 2.собака, 3.кошка/кот, 4.осел, 5 хомяк, 6.лошадь");
        int id = scanner.nextInt();
        System.out.println("Введите имя животного: ");
        String name = scanner.next();
        System.out.println("Дата рождения животного. Введите год рождения животного: ");
        int year = scanner.nextInt();
        System.out.println("Введите месяц рождения животного: ");
        int month = scanner.nextInt();
        System.out.println("Введите день рождения животного: ");
        int day = scanner.nextInt();
        if (id == 1) {
            userService.createAnimal(0,0,AnimalsCategory.PACK_ANIMAL,AnimalsType.CAMEL, name, LocalDate.of(year, month, day), null);
        }
        if (id == 2) {
            userService.createAnimal(0,0,AnimalsCategory.PET,AnimalsType.DOG, name, LocalDate.of(year, month, day), null);
        }
        if (id == 3) {
            userService.createAnimal(0,0,AnimalsCategory.PET,AnimalsType.CAT, name, LocalDate.of(year, month, day), null);
        }
        if (id == 4) {
            userService.createAnimal(0,0,AnimalsCategory.PACK_ANIMAL,AnimalsType.DONKEY, name, LocalDate.of(year, month, day), null);
        }
        if (id == 5) {
            userService.createAnimal(0,0,AnimalsCategory.PET,AnimalsType.HAMSTER, name, LocalDate.of(year, month, day), null);
        }
        if (id == 6) {
            userService.createAnimal(0,0,AnimalsCategory.PACK_ANIMAL,AnimalsType.HORSE, name, LocalDate.of(year, month, day), null);
        }
    }
    /**
     * 9.3 добавление новой(новых) комманды(комманд) животному
     */
    public void addNewCommand() {
        choiceOfAnimalCategory();
        System.out.println("Какому животному вы хотите добавить комманду? Введите его AnimalId: ");
        int id = scanner.nextInt();
        List<Animal> animals = userService.readAllAnimals();
        for (Animal animal : animals) {
            if (id == animal.getAnimalId()) {
                System.out.println("Животное найдено: \n" + animal);
                System.out.println("Какую комманду вы хотите добавить? \n1.идти, 2.стой, 3.убегай, 4.ко мне, 5.лежать, 6.прыжок, 7.умри, 8.встань, 0.остановить ввод комманд");
                petCommands.addCommand();
                System.out.println("Комманды "+petCommands+" успешно добавлены");
                animal.setCommands(petCommands);
                System.out.println(animal);
            }
        }
    }

    /**
     *   9.4 Вывод списка животных по дате рождения
     */
    public void animalsByDateOfBirth() {
        System.out.println("Дата рождения животного. Введите год рождения животного: ");
        int year = scanner.nextInt();
        System.out.println("Введите месяц рождения животного: ");
        int month = scanner.nextInt();
        System.out.println("Введите день рождения животного: ");
        int day = scanner.nextInt();
        List<Animal> animals = userService.readAllAnimals();
        for (Animal animal : animals) {
            if (LocalDate.of(year, month, day).equals(animal.getDateOfBirth())) {
                System.out.println("Животное найдено\n" + animal);
            }
        }
    }

    /**
     * 10. Счетчик животных(в 3 вариантах)
     */
    public void showAnimalCounter () {
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
}

