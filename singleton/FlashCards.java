/**
 * Provides methods to retrive words.
 * @author Matt Larsen
 */
import java.util.Random;
import java.util.ArrayList;
public class FlashCards {
    private static FlashCards instance = null;  //  instance of flashcard class
    private Random rand;  //  Random number generator
    public static FlashCards flashCards;
    private ArrayList<Word> words;  //  List of words
    private Word currentWord;  //  Current word being displayed

    /**
     * Constructs a FlashCards object.
     * Initializes the random num generator and retrieves list of words.
     */
    private FlashCards() {
        this.rand = new Random();
        this.words = FileReader.getWords();
        currentWord = null;
    }

    /**
     * Gets singleton instance of flashcards.
     * @return Singleton instance of flashcards.
     */
    public static FlashCards getInstance() {
        if (instance == null) {
            instance = new FlashCards();
        }
        return instance;
    }

    /**
     * Retrieves random word from collection of flashcards.
     * @return A random word.
     */
    public Word getWord() {
        if (words.isEmpty()) {
            return null;
        }
        currentWord = words.get(rand.nextInt(words.size()));
        return currentWord;
    }
}
