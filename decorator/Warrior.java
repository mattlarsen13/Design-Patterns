package decorator;
/**
 * Represents warrior player.
 * @author Matt Larsen
 */
public class Warrior extends Player {
    /**
     * Constructs a warrior player with name.
     * @param name The name of warrior.
     */
    public Warrior(String name) {
        super(FileReader.getLines("decorator/txt/warrior.txt"), name);
    }
}
