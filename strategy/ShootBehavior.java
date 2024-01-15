package strategy;
/**
 * ShootBehavior which implements OffenceBehavior
 * @author Matt Larsen
 */
 /**
  * @return A string of the action of shoot behavior
  */
public class ShootBehavior implements OffenceBehavior {
    @Override
    public String play(boolean hasPossession) {
        return "Shoots at the goal";
    }
}
