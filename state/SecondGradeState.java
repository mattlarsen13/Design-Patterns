package state;
/**
 * Represents state for second grade
 * @author Matt Larsen
 */
public class SecondGradeState extends State {
    /**
     * Constructor 
     * @param spellingList Spelling list associated with second grade
     */
    public SecondGradeState(SpellingList spellingList) {
        super(spellingList);
    }
    /**
     * Increases grade level to third
     */
    @Override
    public void increaseGrade() {
        spellingList.setState(spellingList.getThirdGradeState());
    }
    /**
     * Decreases grade level to first
     */
    @Override
    public void decreaseGrade() {
        spellingList.setState(spellingList.getFirstGradeState());
    }
}
