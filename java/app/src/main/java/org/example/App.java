package org.example;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String[] gameResults = {"red", "green", "blue", "red", "green", "red"};

        // Create a PatternAnalyzer instance
        PatternAnalyzer analyzer = new PatternAnalyzer(Arrays.asList(gameResults));

        // Perform pattern analysis
        String prediction = analyzer.analyzePattern();
        System.out.println("Predicted color: " + prediction);

        // Detect pattern change
        if (analyzer.detectPatternChange()) {
            System.out.println("Pattern change detected! Stop the bet.");
        }
    }
}
