package org.mart8ins;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class LetterMapper {
    private BigDecimal totalCountOfLetters = new BigDecimal(0);
    public Map<String, BigDecimal> mapLetters(String text){
        totalCountOfLetters = new BigDecimal(text.length());
        Map<String, BigDecimal> mappedLetters =  new HashMap<>();
        for(char ch: text.toCharArray()) {
            String currentChar = Character.toString(ch);
            mappedLetters.put(currentChar, mappedLetters.getOrDefault(currentChar, BigDecimal.ZERO).add(BigDecimal.ONE));
        }
        return mappedLetters;
    }

    public BigDecimal getTotalCountOfLetters() {
        return totalCountOfLetters;
    }


}
