package decorator;
/**
 * Represents sword decorator for player.
 * @author Matt Larsen
 */
import java.util.ArrayList;
public class Sword extends PlayerDecorator {
    /**
     * Constructs aword decorator for player.
     * @param player The player to be decorated.
     */
     public Sword (Player player) {
        super(player);
        integrateDecor(FileReader.getLines("decorator/txt/sword.txt"));
     }
     /**
      * Integrate sword lines into player.
      * @param decor The sword lines.
      */
     @Override
     public void integrateDecor(ArrayList<String> decor) {
        getLines().addAll(decor);
     }
}
