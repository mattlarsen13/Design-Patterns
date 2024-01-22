package observer;
/**
 * Sighting class represents event where cook occurred
 * @author Matt Larsen
 */
import java.util.ArrayList;
public class Sighting {
    private String location;
    private String details;
    private ArrayList<String> accomplices;

    /**
     * Constructs new sighting object with location, details, and accomplices
     * @param location The location of cook
     * @param details The details of cook
     * @param accomplices List of accomplices in cook
     */
    public Sighting(String location, String details, ArrayList<String> accomplices) {
        this.location = location;
        this.details = details;
        this.accomplices = accomplices;
    }

    /**
     * Gets location of cook
     * @return location of sighting
     */
    public String getLocation() {
        return location;
    }
    /**
     * Gets details of cook
     * @return details of sighting
     */
    public String getDetails() {
        return details;
    }
    /**
     * Gets list of accomplices in sighting
     * @return list of accomplices
     */
    public ArrayList<String> getAccomplices() {
        return accomplices;
    }
    
}
