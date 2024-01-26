package io.tripled.scorekeeper;

import java.util.List;

/**
 * This is where all your logic should go.
 * It is the entry point for the CLI as well as Web front end adapter.
 * <p>
 * So do not change the API!
 */
public class ScoreKeeperService {

    public List<String> processCommand(String input) {
        return List.of("I read :" + input);
    }
}
