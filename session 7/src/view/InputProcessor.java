package view;

import java.util.Scanner;

public class InputProcessor {
    public void run() {
        Scanner scanner = new Scanner(System.in);

        String input;
        while (true) {
            input = scanner.nextLine();
            if (InputCommands.ADD_PERSON.getMatcher(input).matches()) {
                System.out.println("add person");
            } else if (InputCommands.ADD_BOOK.getMatcher(input).matches()) {
                System.out.println("add book");
            } else if (InputCommands.SET_DATE.getMatcher(input).matches()) {
                System.out.println("set date");
            } else if (InputCommands.EXIT.getMatcher(input).matches()) {
                System.out.println("exit");
                break;
            }
        }
    }
}
