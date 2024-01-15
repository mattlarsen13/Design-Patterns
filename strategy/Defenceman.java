package strategy;
/**
* @author Matt Larsen
* Constructs a new Defenceman with specified names
* Offensive and defensive behaviors are randomly assigned during creation
* @param firstName The first name of the Defenceman
* @param lastName  The last name of the Defenceman
*/
public class Defenceman extends Player {
    public Defenceman(String firstName, String lastName) {
        super(firstName, lastName, "Defenceman");
        if (Math.random() < 0.9) {
            setOffenceBehavior(new PassBehavior());
        } else {
            setOffenceBehavior(new SlapShotBehavior());
        }
        
        if (Math.random() < 0.5) {
            setDefenceBehavior(new ChasePuckBehavior());
        } else {
            setDefenceBehavior(new BlockBehavior());
        }
    }
}
