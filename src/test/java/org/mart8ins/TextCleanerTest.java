package org.mart8ins;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextCleanerTest {

    @Test
    @DisplayName("Numbers are removed from text.")
    void numbersRemoved() {
        String result = TextCleaner.cleanText("42424absc24hgk32dkf242424");
        Assertions.assertEquals(result, "abschgkdkf");
    }

    @Test
    @DisplayName("Special characters are removed from text")
    void specialCharactersRemoved() {
        String result = TextCleaner.cleanText("@#$%absch*((^gkdkf^&&((");
        Assertions.assertEquals(result, "abschgkdkf");
    }

    @Test
    @DisplayName("Special characters and numbers are removed from text")
    void specialCharactersAndNumbersRemoved() {
        String result = TextCleaner.cleanText("@#$%ab342sch34242*((^gk2423dkf^2343&&((");
        Assertions.assertEquals(result, "abschgkdkf");
    }

    @Test
    @DisplayName("Cyrillic is removed from text")
    void containsOnlyEnglishCharacters() {
        String result = TextCleaner.cleanText("abschgкриликkdkf");
        Assertions.assertEquals(result, "abschgkdkf");
    }

    @Test
    @DisplayName("Spaces are removed from text")
    void spacesRemoved() {
        String result = TextCleaner.cleanText(" ab s ch  gkdkf");
        Assertions.assertEquals(result, "abschgkdkf");
    }

}