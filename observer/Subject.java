package observer;
/**
 * Subject interface represents an object that is observed by multiple observers
 * @author Matt Larsen
 */
import java.util.ArrayList;
public interface Subject {
    /**
     * Registers observer to receive notifications
     * @param observer The observer to register
     */
    void registerObserver(Observer observer);
    /**
     * Removes observer from list of observers
     * @param observer The observer to remove
     */
    void removeObserver(Observer observer);
    /**
     * Notifies registed observers about a change in subject
     * @param location The location of event
     * @param description The description of event
     * @param accomplices The accomplices involved in event
     */
    void notifyObservers(String location, String description, ArrayList<String> accomplices);    
}  
