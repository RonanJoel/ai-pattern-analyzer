package org.example;

import java.util.List;

public class PatternAnalyzer {
    private final List<String> gameResults;

    public PatternAnalyzer(List<String> gameResults) {
        this.gameResults = gameResults;
    }

    public String analyzePattern() {
        // Example prediction logic: return the most frequent color
        return gameResults.stream()
                .reduce((a, b) -> 
                    gameResults.stream().filter(color -> color.equals(a)).count() > 
                    gameResults.stream().filter(color -> color.equals(b)).count() ? a : b)
                .orElse("unknown");
    }

    public boolean detectPatternChange() {
        // Example logic: detect if the last two colors differ
        if (gameResults.size() < 2) return false;
        int lastIndex = gameResults.size() - 1;
        return !gameResults.get(lastIndex).equals(gameResults.get(lastIndex - 1));
    }
}
