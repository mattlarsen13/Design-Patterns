package observer;
/**
 * Cook class to represent a subject that can be observed by multiple observers
 * @author Matt Larsen
 */
import java.util.ArrayList;
public class Cook implements Subject {
    private ArrayList<Observer> observers;
    private String name;
    /**
     * Constructs new cook object with name
     * @param name Name of cook
     */
    public Cook(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
    }
    /**
     * Registers observer to receive notifications of cook
     * @param observer The observer that is registered
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    /**
     * Removes observer from list of observers
     * @param observer The observer that is removed
     */
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    /**
     * Notifies registered observers of sighting
     * @param location The location of sighting
     * @param description The details of sighting
     * @param accomplices The list of accomplices in sighting
     */
    @Override
    public void notifyObservers(String location, String description, ArrayList<String> accomplices) {
        for (Observer observer : observers) {
            observer.update(location, description, accomplices);
        }
    }
    /**
     * Enters sighting and notifies observers
     * @param location The location of sighting
     * @param description The description of sighting
     * @param accomplices The list of accomplices
     */
    public void enterSighting(String location, String description, String accomplices) {
        ArrayList<String> accompliceList = convertAccomplicesStringToList(accomplices);
        notifyObservers(location, description, accompliceList);
    }
    /**
     * Helper method to convert string to ArrayList
     * @param accomplices a string list of accomplices
     * @return array list containing accomplices
     */
    private ArrayList<String> convertAccomplicesStringToList(String accomplices) {
        String[] accompliceArray = accomplices.split(", ");
        ArrayList<String> accompliceList = new ArrayList<>();
        for (String accomplice : accompliceArray) {
            accompliceList.add(accomplice);
        }
        return accompliceList;
    }
    /**
     * Gets name of cook
     * @return name of cook
     */
    public String getName() {
        return name;
    }
}
