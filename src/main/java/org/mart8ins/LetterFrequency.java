package org.mart8ins;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;

public class LetterFrequency {
    public static Map<String, BigDecimal> calculateFrequency(Map<String, BigDecimal> mappedLetters, BigDecimal totalCountOfLetters){
        Map<String, BigDecimal> letterFrequency = new HashMap<>();
        MathContext mc = new MathContext(2);
        for(Map.Entry<String, BigDecimal> letter: mappedLetters.entrySet()) {
            letterFrequency.put(letter.getKey(), letter.getValue().divide(totalCountOfLetters, mc).multiply(new BigDecimal(100)).stripTrailingZeros());
        }
        return letterFrequency;
    }
}
