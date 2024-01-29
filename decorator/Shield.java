package decorator;
/**
 * Represents shield decorator for player.
 * @author Matt Larsen
 */
import java.util.ArrayList;
public class Shield extends PlayerDecorator {
    /**
     * Constructs shield decorator for player.
     * @param player The player to be decorated.
     */
     public Shield(Player player) {
        super(player);
        integrateDecor(FileReader.getLines("decorator/txt/shield.txt"));
     }
     /**
      * Integrate shield lines into player.
      * @param decor The shield lines.
      */
     @Override
     public void integrateDecor(ArrayList<String> decor) {
        getLines().addAll(decor);
     }
}
