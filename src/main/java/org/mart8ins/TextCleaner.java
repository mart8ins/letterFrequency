package org.mart8ins;
public class TextCleaner {
    public static String cleanText(String textToClean) {
        return textToClean.replaceAll("[^a-z]", "");
    }
}
