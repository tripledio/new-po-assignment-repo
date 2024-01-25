package io.tripled.scorekeeper;


import io.tripled.scorekeeper.cli.CLIScorekeeperApplication;
import io.tripled.scorekeeper.web.WebModeApplication;

public class ScorekeeperApplication {

    public static void main(String[] args) {
        if (mustRunInWebMode(args)) {
            WebModeApplication.runWebApp(args);
        } else {
            CLIScorekeeperApplication.runConsoleApp();
        }
    }

    private static boolean mustRunInWebMode(String[] args) {
        return args.length > 0 && args[0].equalsIgnoreCase("web");
    }

}
