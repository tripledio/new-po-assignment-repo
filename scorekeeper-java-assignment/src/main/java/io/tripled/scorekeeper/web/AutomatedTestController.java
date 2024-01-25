package io.tripled.scorekeeper.web;

import io.tripled.scorekeeper.ScoreKeeperService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AutomatedTestController {
    private final Logger logger = LoggerFactory.getLogger(AutomatedTestController.class);
    private final ScoreKeeperService service = new ScoreKeeperService();

    @PostMapping(value = "execute")
    public KeepScoreResult execute(@RequestBody KeepScoreCommand command) {
        logger.info("Received command with instruction [" + command.getInstruction() + "]");
        final String instruction = command.getInstruction();

        final String result = service.processCommand(instruction);

        final KeepScoreResult keepScoreResult = new KeepScoreResult();
        keepScoreResult.setResult(result);
        logger.info("Returning [" + keepScoreResult + "]");
        return keepScoreResult;
    }
}
