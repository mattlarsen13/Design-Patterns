package strategy;
/**
 * ChasePuckBehavior which implements DefenceBehavior
 * @author Matt Larsen
 */

 /**
  * @return A string of the action of chasepuck behavior
  */
public class ChasePuckBehavior implements DefenceBehavior {
    @Override
    public String play(boolean hasPossession) {
        return "Chases the puck";
    }
}
