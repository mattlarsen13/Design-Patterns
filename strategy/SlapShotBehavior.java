package strategy;
/**
 * SlapShotBehavior which implements OffenceBehavior
 * @author Matt Larsen
 */

 /**
  * @return A string of the action of slapshot behavior
  */
public class SlapShotBehavior implements OffenceBehavior{
    @Override
    public String play(boolean hasPossession) {
        return "Shoot the puck from the blue line";
    }
}
