package strategy;
/**
* @author Matt Larsen
* Constructs a new Forward with specified names
* Offensive and defensive behaviors are randomly assigned during creation
* @param firstName The first name of the Forward
* @param lastName  The last name of the Forward
*/
public class Forward extends Player{
    public Forward(String firstName, String lastName) {
        super(firstName, lastName, "Forward");
        if (Math.random() < 0.5) {
            setOffenceBehavior(new PassBehavior());
        } else {
            setOffenceBehavior(new ShootBehavior());
        }

        if (Math.random() < 0.5) {
            setDefenceBehavior(new ChasePuckBehavior());
        } else {
            setDefenceBehavior(new BlockBehavior());
        }
    }
}
