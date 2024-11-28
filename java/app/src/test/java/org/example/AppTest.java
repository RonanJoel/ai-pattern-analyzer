package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Arrays;

public class AppTest {
    @Test
    public void testPatternAnalyzer() {
        PatternAnalyzer analyzer = new PatternAnalyzer(Arrays.asList("red", "red", "blue", "green"));
        assertEquals("red", analyzer.analyzePattern());
    }

    @Test
    public void testPatternChangeDetection() {
        PatternAnalyzer analyzer = new PatternAnalyzer(Arrays.asList("red", "blue", "blue", "green"));
        assertTrue(analyzer.detectPatternChange());
    }
}
