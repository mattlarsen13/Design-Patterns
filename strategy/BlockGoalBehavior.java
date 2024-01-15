package strategy;
/**
 * BlockGoalBehavior which implements OffenceBehavior and DefenceBehavior
 * @author Matt Larsen
 */

 /**
  * @return A string of the action of blockgoal behavior
  * String is taken from an array of messages at Random
  */
import java.util.Random;
public class BlockGoalBehavior implements OffenceBehavior, DefenceBehavior{
    @Override
    public String play(boolean hasPossession) {
        String[] messages = {"hand blocks the puck", "catches the puck", "blocks puck with knee pads", "blocks puck with stick"};
        return messages[new Random().nextInt(messages.length)];
    }
    
}
