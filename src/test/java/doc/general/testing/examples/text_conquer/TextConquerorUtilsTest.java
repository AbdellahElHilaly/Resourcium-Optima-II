package doc.general.testing.examples.text_conquer;

import com.youcode.libs.print.Printer;
import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TextConquerorUtilsTest {

    @BeforeAll
    static void setUp() {
        Printer.success("@BeforeAll setUp() method called");
    }

    @AfterAll
    static void tearDown() {
        Printer.success("@AfterAll tearDown() method called");
    }

    @BeforeEach
    void setUp2() {
        Printer.warning("@BeforeEach setUp() method called");
    }

    @AfterEach
    void tearDown2() {
        Printer.error("@AfterEach tearDown() method called");
    }


    @Test
    void testGetWords() {
        Printer.info("testGetWords() method called");
        String text = "This is a sample text. Split it into words!";
        List<String> words = TextConquerorUtils.getWords(text);


        assertEquals(9, words.size());

        assertTrue(words.contains("This"));
        assertTrue(words.contains("a"));
        assertTrue(words.contains("words"));
    }

    @Test
    void testGetPunctuationMarks() {
        Printer.info("testGetPunctuationMarks() method called");
        String text = "Hello, world! This is a test.";
        List<Character> punctuationMarks = TextConquerorUtils.getPunctuationMarks(text);

        assertEquals(3, punctuationMarks.size());

        assertTrue(punctuationMarks.contains(','));
        assertTrue(punctuationMarks.contains('!'));
        assertTrue(punctuationMarks.contains('.'));
    }

    @Test
    void testGetCharacters() {
        Printer.info("testGetCharacters() method called");
        String text = "abc 123";
        List<Character> characters = TextConquerorUtils.getCharacters(text);

        // Check if the number of characters is correct
        assertEquals(7, characters.size());

        // Check specific characters
        assertTrue(characters.contains('a'));
        assertTrue(characters.contains('1'));
        assertTrue(characters.contains(' '));
    }

    @Test
    void testGetSentences() {
        Printer.info("testGetSentences() method called");
        String text = "Sentence 1. Sentence 2? Sentence 3!";
        List<String> sentences = TextConquerorUtils.getSentences(text);

        assertEquals(3, sentences.size());

        assertTrue(sentences.contains("Sentence 1"));
        assertFalse(sentences.contains(" Sentence 2?"));
        assertTrue(sentences.contains(" Sentence 3"));
    }

    @Test
    void testGetConsonants() {
        Printer.info("testGetConsonants() method called");
        String text = "Hello, world!";
        List<Character> consonants = TextConquerorUtils.getConsonants(text);

        // Check if the number of consonants is correct
        assertEquals(7, consonants.size());

        // Check specific consonants
        assertTrue(consonants.contains('H'));
        assertFalse(consonants.contains('o'));
        assertTrue(consonants.contains('w'));
    }

    @Test
    void testGetVowels() {
        Printer.info("testGetVowels() method called");
        String text = "Hello, world!";
        List<Character> vowels = TextConquerorUtils.getVowels(text);

        // Check if the number of vowels is correct
        assertEquals(3, vowels.size());

        // Check specific vowels
        assertTrue(vowels.contains('e'));
        assertFalse(vowels.contains('H'));
        assertTrue(vowels.contains('o'));
    }
}
