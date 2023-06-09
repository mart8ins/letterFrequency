package org.mart8ins;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LetterMapperTest {

    @Test
    @DisplayName("Text is mapped with letter count accordingly")
    void mapLetters1() {
        Map<String, BigDecimal> expected = new HashMap<>();
        expected.put("a", new BigDecimal(1));
        expected.put("b", new BigDecimal(2));
        expected.put("c", new BigDecimal(3));

        LetterMapper letterMapper = new LetterMapper();

        Map<String, BigDecimal> result = letterMapper.mapLetters("abbccc");
        assertEquals(expected.get("a"), result.get("a"));
        assertEquals(expected.get("b"), result.get("b"));
        assertEquals(expected.get("c"), result.get("c"));
    }

    @Test
    @DisplayName("Text is mapped with letter count accordingly")
    void mapLetters2() {
        Map<String, BigDecimal> expected = new HashMap<>();
        expected.put("z", new BigDecimal(5));
        expected.put("b", new BigDecimal(2));
        expected.put("g", new BigDecimal(6));
        LetterMapper letterMapper = new LetterMapper();
        Map<String, BigDecimal> result = letterMapper.mapLetters("zzzzzbbgggggg");
        assertEquals(expected.get("a"), result.get("a"));
        assertEquals(expected.get("b"), result.get("b"));
        assertEquals(expected.get("c"), result.get("c"));
    }

    @Test
    void getTotalCountOfLetters() {
        LetterMapper letterMapper = new LetterMapper();
        letterMapper.mapLetters("abbccc");
        assertEquals(new BigDecimal(6), letterMapper.getTotalCountOfLetters());
    }
}