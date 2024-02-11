/**
 * Represents a Word with the attributes word, type, definition, and sentence(example).
 * @author Matt Larsen
 */
public class Word {
    private String word;
    private String type;
    private String definition;
    private String sentence;

    /**
     * Constructs a word object with 4 attributes.
     * @param word The word.
     * @param type The type of word(adj, noun, verb, etc).
     * @param definition The definition of word.
     * @param sentence An example using the word.
     */
    public Word(String word, String type, String definition, String sentence) {
        this.word = word;
        this.type = type;
        this.definition = definition;
        this.sentence = sentence;
    }

    /**
     * Retrieves word.
     * @return The word.
     */
    public String getWord() {
        return word;
    }

    /**
     * Displays the sentence when running UI.
     * @return The type, definition and example of word.
     */
    public String getDescription() {
        return "Part of Speech: "+type+"\nDefinition: "+definition+"\n"+sentence;
    }
}
