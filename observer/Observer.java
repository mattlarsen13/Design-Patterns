package observer;
/**
 * Observer interface that represents an object that observes the changes in a subject
 * @author Matt Larsen
 */
import java.util.ArrayList;

public interface Observer {
    /**
     * Updates observer with info about a change
     * @param location The location of event
     * @param description The description of event
     * @param accomplices The list of accomplices in event
     * 
     */
    void update(String location, String description, ArrayList<String> accomplices);
    /**
     * gets log maintained by observer
     * @return log of notes as string
     */
    String getLog();
}
