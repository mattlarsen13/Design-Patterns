package strategy;
import java.util.Random;
/**
 * ShootBehavior which implements OffenceBehavior
 * @author Matt Larsen
 */

 /**
  * @return A string of the action of shoot behavior
  */
public class BlockBehavior implements DefenceBehavior {
    @Override
    public String play(boolean hasPossession) {
        String[] messages = {"blocks player from passing", "blocks player from shooting", "checks player with puck"};
        return messages[new Random().nextInt(messages.length)];
    }
}
