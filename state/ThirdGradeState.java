package state;
/**
 * Represents state for third grade
 * @author Matt Larsen
 */
public class ThirdGradeState extends State {
    /**
     * Constructor
     * @param spellingList The spelling list associated with third grade
     */
    public ThirdGradeState(SpellingList spellingList) {
        super(spellingList);
    }
    /**
     * Increases grade, since it is highest does nothing
     */
    @Override
    public void increaseGrade() {

    }
    /**
     * Decreases grade to second grade
     */
    @Override
    public void decreaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());
    }
}
