package strategy;
/**
 * Constructor for player
 * @author Matt Larsen
 */
public abstract class Player {
    private String firstName;
    private String lastName;
    private String position;
    private OffenceBehavior offenceBehavior;
    private DefenceBehavior defenceBehavior;

    /**
     * Constructs new player with names and positions
     * @param firstName The first name of the player
     * @param lastName  The last name of the player
     * @param position  The position played by the player
     */
    public Player(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

     /**
     * Sets offensive behavior for player
     * @param offenceBehavior offensive behavior to be set
     */
    public void setOffenceBehavior(OffenceBehavior offenceBehavior) {
        this.offenceBehavior = offenceBehavior;
    }

     /**
     * Sets defensive behavior for player
     * @param defenceBehavior defensive behavior to be set
     */
    public void setDefenceBehavior(DefenceBehavior defenceBehavior) {
        this.defenceBehavior = defenceBehavior;
    }

    /**
     * Plays game based on possession
     * @param hasPossession boolean indicating whether the player has possession
     * @return string describing the player's action based on possession
     */
    public String play(boolean hasPossession) {
        if (hasPossession) {
            return offenceBehavior.play(hasPossession);
        } else {
            return defenceBehavior.play(hasPossession);
        }
    }

    /**
     * Returns a string representation of player
     * @return string containing the player's names and position
     */
    @Override
    public String toString() {
        return firstName + " " + lastName + " plays the position: " + position;
    }
}
