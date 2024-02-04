package state;
/**
 * Represents state for first grade
 * @author Matt Larsen
 */
public class FirstGradeState extends State {
    /**
     * Constructor for FirstGradeState
     * @param spellingList Spelling list associated with first grade
     */
    public FirstGradeState(SpellingList spellingList) {
        super(spellingList);
    }
    /**
     * Increases grade level to second grade
     */
    @Override
    public void increaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());
    }
    /**
     * Decreases grade, since it is first grade, it does nothing
     */
    @Override
    public void decreaseGrade() {

    }
}
