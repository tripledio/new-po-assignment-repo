package io.tripled.scorekeeper.cli;


import io.tripled.scorekeeper.ScoreKeeperService;

import java.util.List;
import java.util.Scanner;

public class CLIScorekeeperApplication {


    public static void runConsoleApp() {
        System.out.println("**************************");
        System.out.println("**    Scorekeeper       **");
        System.out.println("**************************");
        readInput();
    }

    private static void readInput() {
        System.out.println("> q to quit");
        try (Scanner scanner = new Scanner(System.in)) {
            final ScoreKeeperService service = new ScoreKeeperService();
            String input;
            do {
                input = scanner.nextLine();
                final List<String> result = service.processCommand(input);
                result.forEach(System.out::println);
            }
            while (!isQuit(input));
        }
        System.out.println("*********END*****************");
    }

    private static boolean isQuit(String input) {
        return "q".equalsIgnoreCase(input);
    }
}
