package decorator;
/**
 * Represents an abstract player decorator.
 * @author Matt Larsen
 */
import java.util.ArrayList;
public abstract class PlayerDecorator extends Player {
     protected Player player;
     /**
      * Constructs player decorator with specified player.
      * @param player The player to be decorated.
      */
     public PlayerDecorator(Player player) {
        super(player.getLines(), player.getName());
        this.player = player;
     }
     /**
      * Integrates decor lines into player's lines.
      * @param decor The decoration lines to integrate.
      */
     public abstract void integrateDecor(ArrayList<String> decor);
}
