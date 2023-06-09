package org.mart8ins;

import java.math.BigDecimal;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
            String fileText = TextReader.readFile("story.txt");
            String cleanedText = TextCleaner.cleanText(fileText);

            LetterMapper letterMapper = new LetterMapper();
            Map<String, BigDecimal> mappedLetters = letterMapper.mapLetters(cleanedText);
            BigDecimal totalCountOfLetters = letterMapper.getTotalCountOfLetters();

            Map<String, BigDecimal> frequency = LetterFrequency.calculateFrequency(mappedLetters, totalCountOfLetters);

            System.out.println("Total number of characters - " + totalCountOfLetters);
            for(Map.Entry freq: frequency.entrySet()) {
                System.out.printf("| %-2s | %5.2f%% |\n", freq.getKey(), freq.getValue());
            }
    }
}