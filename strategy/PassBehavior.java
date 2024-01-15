package strategy;
/**
 * PassBehavior which implements from OffenceBehavior
 * @author Matt Larsen
 */

 /**
  * @return a String of the action of pass behavior
  */
public class PassBehavior implements OffenceBehavior{
    @Override
    public String play(boolean hasPossession) {
        return "Passes to a forward";
    }
}
