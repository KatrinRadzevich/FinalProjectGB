package src.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetCommands {
    List<Command> commands = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    /**
     * 9.2 вывести список комманд
     */
    public void PetCommands() {
        if (!commands.isEmpty()) {
            System.out.print("Список команд: ");
            for (Command command : commands) {
                System.out.print(command + " ");
            }
            System.out.println();
        } else {
            System.out.println("Список команд пуст.");
        }
    }

    /**
     * 9.3 добавление новой(новых) комманды(комманд) животному
     */
    public void addCommand() {
        commands.clear();
        int menuNumber = 1;
        while (menuNumber !=0){
            menuNumber = scanner.nextInt();
            if (menuNumber == 1) {
                commands.add(Command.GO);
            }
            if (menuNumber == 2) {
                commands.add(Command.STOP);
            }
            if (menuNumber == 3) {
                commands.add(Command.RUN_AWAY);
            }
            if (menuNumber == 4) {
                commands.add(Command.COME_UP);
            }
            if (menuNumber == 5) {
                commands.add(Command.LIE);
            }
            if (menuNumber == 6) {
                commands.add(Command.JUMP);
            }
            if (menuNumber == 7) {
                commands.add(Command.TRUP);
            }
            if (menuNumber == 8) {
                commands.add(Command.STAND_UP);
            }
        }
    }

    @Override
    public String toString() {
        return commands.toString();
    }
}

