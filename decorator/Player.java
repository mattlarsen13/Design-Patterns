package decorator;
/**
 * Represents player in game.
 * @author Matt Larsen
 */
import java.util.ArrayList;
public class Player {
     private String name;
     protected ArrayList<String> lines;
    /**
     * Constructs player with specificed lines and name.
     * @param lines The line of player.
     * @param name The name of player.
     */
     public Player(ArrayList<String> lines, String name) {
        this.lines = lines;
        this.name = name;   
     }
     /**
      * Gets name of player.
      * @return Name of player.
      */
     public String getName() {
        return name;
     }
     /**
      * Gets lines of player.
      * @return Lines of player.
      */
     public ArrayList<String> getLines() {
        return lines;
     }
     /**
      * Creates string representation of player.
      * @return The string representation of player.
      */
     @Override
     public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("##### ").append(name).append(" #####").append("\n");
        for (String line : lines) {
            stringBuilder.append(line).append("\n");
        }
        return stringBuilder.toString();
     }

}
