package io.tripled.scorekeeper.web;

import java.util.List;

public record KeepScoreResult(List<String> result) {

    public List<String> getResult() {
        return result;
    }

}
