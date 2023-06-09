package org.mart8ins;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LetterFrequencyTest {

    @Test
    @DisplayName("Letter frequency for two characters, equal amount")
    void calculateFrequency() {
        LetterMapper letterMapper = new LetterMapper();
        Map<String, BigDecimal> letterMappingResult = letterMapper.mapLetters("aaaccc");
        BigDecimal totalCount = letterMapper.getTotalCountOfLetters();

        Map<String, BigDecimal> letterFrequencyResult = LetterFrequency.calculateFrequency(letterMappingResult, totalCount);

        Map<String, BigDecimal> expected = new HashMap<>();
        expected.put("a", new BigDecimal(50.00));
        expected.put("c", new BigDecimal(50.00));

        assertTrue(expected.get("a").toPlainString().equals(letterFrequencyResult.get("a").toPlainString()));
        assertTrue(expected.get("c").toPlainString().equals(letterFrequencyResult.get("c").toPlainString()));
    }

    @Test
    @DisplayName("Letter frequency for four characters, equal amount")
    void calculateFrequency1() {
        LetterMapper letterMapper = new LetterMapper();
        Map<String, BigDecimal> letterMappingResult = letterMapper.mapLetters("abcd");
        BigDecimal totalCount = letterMapper.getTotalCountOfLetters();

        Map<String, BigDecimal> letterFrequencyResult = LetterFrequency.calculateFrequency(letterMappingResult, totalCount);

        Map<String, BigDecimal> expected = new HashMap<>();
        expected.put("a", new BigDecimal(25.00));
        expected.put("b", new BigDecimal(25.00));
        expected.put("c", new BigDecimal(25.00));
        expected.put("d", new BigDecimal(25.00));

        assertTrue(expected.get("a").toPlainString().equals(letterFrequencyResult.get("a").toPlainString()));
        assertTrue(expected.get("b").toPlainString().equals(letterFrequencyResult.get("b").toPlainString()));
        assertTrue(expected.get("c").toPlainString().equals(letterFrequencyResult.get("c").toPlainString()));
        assertTrue(expected.get("d").toPlainString().equals(letterFrequencyResult.get("d").toPlainString()));

    }

    @Test
    @DisplayName("Letter frequency for three characters, a is 50%, rest two is 25%")
    void calculateFrequency2() {
        LetterMapper letterMapper = new LetterMapper();
        Map<String, BigDecimal> letterMappingResult = letterMapper.mapLetters("aabc");
        BigDecimal totalCount = letterMapper.getTotalCountOfLetters();

        Map<String, BigDecimal> letterFrequencyResult = LetterFrequency.calculateFrequency(letterMappingResult, totalCount);

        Map<String, BigDecimal> expected = new HashMap<>();
        expected.put("a", new BigDecimal(50.00));
        expected.put("b", new BigDecimal(25.00));
        expected.put("c", new BigDecimal(25.00));

        assertTrue(expected.get("a").toPlainString().equals(letterFrequencyResult.get("a").toPlainString()));
        assertTrue(expected.get("b").toPlainString().equals(letterFrequencyResult.get("b").toPlainString()));
        assertTrue(expected.get("c").toPlainString().equals(letterFrequencyResult.get("c").toPlainString()));

    }
}