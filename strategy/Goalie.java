package strategy;
/**
 * Constructs a new Goalie with specified names
 * Offensive and defensive behaviors are set to BlockGoalBehavior
 * @author Matt Larsen
 */
public class Goalie extends Player{
    /**
     * @param firstName The first name of the Goalie
     * @param lastName  The last name of the Goalie
     */
    public Goalie(String firstName, String lastName) {
    super(firstName, lastName, "Goalie");
    setOffenceBehavior(new BlockGoalBehavior());
    setDefenceBehavior(new BlockGoalBehavior());
    }
}
