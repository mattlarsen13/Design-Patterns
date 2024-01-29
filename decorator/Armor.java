package decorator;
/**
 * Represents armor decorator for player.
 * @author Matt Larsen
 */
import java.util.ArrayList;
public class Armor extends PlayerDecorator {
    /**
     * Constructs armor decorator for player.
     * @param player The player to be decorated.
     */
     public Armor(Player player) {
        super(player);
        integrateDecor(FileReader.getLines("decorator/txt/armor.txt"));
     }
     /**
      * Integrate armors lines into player.
      * @param decor The armor lines.
      */
     @Override
     public void integrateDecor(ArrayList<String> decor) {
        getLines().addAll(decor);
     }
}