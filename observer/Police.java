package observer;
/**
 * Police class that represents an observer that observers cook
 * @author Matt Larsen
 */
import java.util.ArrayList;
public class Police implements Observer{
    private Subject cook;
    private ArrayList<String> locations;
    private String notes;
    private ArrayList<String> people;
    /**
     * Constructs new police obkect with specific cook as subject
     * @param cook The cook subject that is being observed
     */
    public Police(Subject cook) {
        this.cook = cook;
        this.cook.registerObserver(this);
        this.locations = new ArrayList<>();
        this.notes = "";
        this.people = new ArrayList<>();
    }
    /**
     * Updates police with info about a change in cooks info
     * @param location The location of event
     * @param description The details of event
     * @param accomplices The list of accomplices involved
     */
    @Override
    public void update(String location, String description, ArrayList<String> accomplices) {
        locations.add(location);
    notes += description + "\n";
    for (String accomplice : accomplices) {
        if (!people.contains(accomplice)) {
            people.add(accomplice);
        }
    }
    }
    /**
     * Gets police log about events
     * @return String representing log
     */
    @Override
    public String getLog() {
        StringBuilder log = new StringBuilder("Locations:\n");
        for (String location : locations) {
            log.append("- ").append(location).append("\n");
        }
        log.append("\nNotes:\n");
        String[] noteLines = notes.trim().split("\n");
        for (String noteLine : noteLines) {
            log.append("- ").append(noteLine).append("\n");
        }
        log.append("\nAccomplices:\n");
        for (String accomplice : people) {
            log.append("- ").append(accomplice).append("\n");
        }
        return log.toString();
    }
}
