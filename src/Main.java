package src;

import src.controller.Controller;
import src.model.AnimalsType;
import src.model.Command;
import src.model.PetCommands;
import src.view.UserView;

import java.time.LocalDate;

import static src.model.AnimalsCategory.PACK_ANIMAL;
import static src.model.AnimalsCategory.PET;
import static src.model.AnimalsType.CAMEL;
import static src.model.AnimalsType.CAT;
import static src.model.Command.LIE;
import static src.model.Command.RUN_AWAY;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.createAnimal(100, 200, PACK_ANIMAL, CAMEL, "Lazzy", LocalDate.of(2020, 01, 13), LIE);
        controller.createAnimal(0,1, PET, CAT, "Kisa2", LocalDate.of(2024, 05, 16), RUN_AWAY);
        controller.createAnimal(0, 5,PET, CAT, "Kisa12", LocalDate.of(2024, 05, 16), RUN_AWAY);
        controller.createAnimal(100, 200, PACK_ANIMAL, CAMEL, "Laazzy", LocalDate.of(2020, 01, 13), LIE);
        controller.createAnimal(100, 100,PACK_ANIMAL, CAMEL, "Lazzy2", LocalDate.of(2020, 01, 13), LIE);

//        controller.getAllAnimals();
//        System.out.println();
//        controller.getPetsOnly();
//        System.out.println();
//        controller.getPackAnimalsOnly();
//        System.out.println();
        controller.menuStart();




    }

}
