package doc.general.testing.examples.text_conquer;

import lombok.Data;

import java.util.List;

@Data
public class TextConqueror {


    private String text;
    private List<String> words;
    private List<Character> punctuationMarks;
    private List<Character> characters;
    private List<String> sentences;
    private List<Character> consonants;
    private List<Character> vowels;

    public TextConqueror(String text) {
        this.text = text;
    }

    public TextConqueror adaptation() {
        this.words = TextConquerorUtils.getWords(text);
        this.punctuationMarks = TextConquerorUtils.getPunctuationMarks(text);
        this.characters = TextConquerorUtils.getCharacters(text);
        this.sentences = TextConquerorUtils.getSentences(text);
        this.consonants = TextConquerorUtils.getConsonants(text);
        this.vowels = TextConquerorUtils.getVowels(text);
        return this;
    }


}
