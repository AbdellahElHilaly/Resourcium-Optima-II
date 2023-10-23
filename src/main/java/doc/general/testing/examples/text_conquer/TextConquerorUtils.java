package doc.general.testing.examples.text_conquer;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextConquerorUtils {

    public static List<String> getWords(String text) {
        String[] wordsArray = text.split("[\\s.,!?;]+");
        return List.of(wordsArray);
    }

    public static List<Character> getPunctuationMarks(String text) {
        List<Character> punctuationMarks = new ArrayList<>();
        Pattern pattern = Pattern.compile("[.,!?;]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            punctuationMarks.add(matcher.group().charAt(0));
        }
        return punctuationMarks;
    }

    public static List<Character> getCharacters(String text) {
        List<Character> characters = new ArrayList<>();
        for (char c : text.toCharArray()) {
            characters.add(c);
        }
        return characters;
    }

    public static List<String> getSentences(String text) {
        String[] sentencesArray = text.split("[.!?]");
        return List.of(sentencesArray);
    }

    public static List<Character> getConsonants(String text) {
        List<Character> consonants = new ArrayList<>();
        text = text.replaceAll("[^a-zA-Z]", "");
        for (char c : text.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) == -1) {
                consonants.add(c);
            }
        }
        return consonants;
    }

    public static List<Character> getVowels(String text) {
        List<Character> vowels = new ArrayList<>();
        text = text.replaceAll("[^a-zA-Z]", "");
        for (char c : text.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                vowels.add(c);
            }
        }
        return vowels;
    }
}
