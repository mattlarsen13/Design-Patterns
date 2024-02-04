package state;
/**
 * Base class for different spelling states
 * @author Matt Larsen
 */
import java.util.ArrayList;
import java.util.Random;
public class State {
    protected SpellingList spellingList;
    protected ArrayList<String> words;
    protected Random rand;
    /**
     * Constructor
     * @param spellingList The spelling list associated with this state
     */
    public State(SpellingList spellingList) {
        this.spellingList = spellingList;
        this.words = new ArrayList<>();
        this.rand = new Random();
    }
    /**
     * Gets next word from list
     * @return The next word
     */
    public String getNextWord() {
        String fileName;
        if (this instanceof FirstGradeState) {
            fileName = "state/txt/first.txt";
        } else if (this instanceof SecondGradeState) {
            fileName = "state/txt/second.txt";
        } else {
            fileName = "state/txt/third.txt";
        /* } else {
            fileName = "default.txt"; */
        } 

        if (words.isEmpty()) {
            words = FileReader.getWords(fileName);
        }
        return words.remove(rand.nextInt(words.size()));
    }
    /**
     * Increases grade level
     */
    public void increaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());
    }
    /**
     * Decreases grade level
     */
    public void decreaseGrade() {
        
    }
}
