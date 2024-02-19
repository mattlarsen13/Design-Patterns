package iterator; 
/**
 * Iterator interface for iterating collection of tickets
 * @author Matt Larsen
 */
public interface Iterator {
    /**
     * Checks if there are more tickets in collection
     * @return true if there are more tickets
     */
    boolean hasNext();

    /**
     * Returns next ticket in collection
     * @return next ticket
     */
    Object next();
}
