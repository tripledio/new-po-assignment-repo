package io.tripled.scorekeeper.web;

import io.tripled.scorekeeper.ScoreKeeperService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class AutomatedTestController {
    private final Logger logger = LoggerFactory.getLogger(AutomatedTestController.class);
    private ScoreKeeperService service = new ScoreKeeperService();

    @PostMapping(value = "execute")
    public KeepScoreResult execute(@RequestBody KeepScoreCommand command) {
        logger.info("Received command with instruction [" + command.getInstruction() + "]");
        final String instruction = command.getInstruction();
        final KeepScoreResult keepScoreResult = handleInstruction(instruction);
        logger.info("Returning [" + keepScoreResult + "]");
        return keepScoreResult;
    }

    private KeepScoreResult handleInstruction(String instruction) {
        if (instruction.equalsIgnoreCase("new")) {
            service = new ScoreKeeperService();
            return new KeepScoreResult(List.of("Refreshed the application"));
        } else {
            final List<String> result = service.processCommand(instruction);
            return new KeepScoreResult(result);
        }
    }

}