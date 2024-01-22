package observer;
/**
 * Cartel class represents observer that observes cook
 * @author Matt Larsen
 */
import java.util.ArrayList;
public class Cartel implements Observer{
    private Subject cook;
    private ArrayList<Sighting> sightings;
    /**
     * Constructs new cartel object with cook as subject
     * @param cook
     */
    public Cartel(Subject cook) {
        this.cook = cook;
        this.cook.registerObserver(this);
        this.sightings = new ArrayList<>();
    }
    /**
     * Updates cartel with info on change in cook event
     * @param location The location of event
     * @param description The details of event
     * @param accomplices The list of accomplices involved
     */
    @Override
    public void update(String location, String description, ArrayList<String> accomplices) {
        sightings.add(new Sighting(location, description, accomplices));
    }
    /**
     * Cartel log containing info on events
     * @return string representing log
     */
    @Override
    public String getLog() {
        StringBuilder log = new StringBuilder("Cartel Log:\n");
        for (Sighting sighting : sightings) {
            log.append(sighting.getLocation()).append(" (").append(sighting.getDetails()).append("), with ");
            for (String accomplice : sighting.getAccomplices()) {
                log.append(accomplice).append(", ");
            }
            log.deleteCharAt(log.length() - 1);
            log.deleteCharAt(log.length() - 1);  
            log.append("\n");
        }
        return log.toString();
    }
}
