package state;
/**
 * Represents spelling list for different states
 */
public class SpellingList {
    private State state;
    /**
     * Constructor
     */
    public SpellingList() {
        this.state = new FirstGradeState(this);
    }
    /**
     * Gets next word from current grade
     * @return next word
     */
    public String getNextWord() {
        return state.getNextWord();
    }
    /**
     * Increases grade
     */
    public void increaseGrade() {
        state.increaseGrade();
    }
    /**
     * Decreases grade
     */
    public void decreaseGrade() {
        state.decreaseGrade();
    }
    /**
     * Gets new instance of first grade state
     * @return instance of first grade state
     */
    public State getFirstGradeState() {
        return new FirstGradeState(this);
    }
    /**
     * Gets new instance of second grade state
     * @return instance of second grade state
     */
    public State getSecondGradeState() {
        return new SecondGradeState(this);
    }
    /**
     * Gets new instance of third grade state
     * @return instance of third grade state
     */
    public State getThirdGradeState() {
        return new ThirdGradeState(this);
    }
    /**
     * Sets current state
     * @param state new state
     */
    public void setState(State state) {
        this.state = state;
    }
}
