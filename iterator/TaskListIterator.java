package iterator; 
/**
 * Iterator implementation over collection of tickets
 * @author Matt Larsen
 */
public class TaskListIterator implements Iterator{
    private Ticket[] tickets;
    private int position;

    /**
     * Constructs new TaskListIterator with specified array of tickets
     * @param tickets array of tickets
     */
    public TaskListIterator(Ticket[] tickets) {
        this.tickets = tickets;
        this.position = 0;
    }

    /**
     * Checks if there are more tickets in collection
     * @return true if there are more tickets
     */
    public boolean hasNext() {
        return position < tickets.length;
    }

    /**
     * Returns the next ticket
     * @return next ticket
     * @throws IndexOutofBoundsException if they are no more elements
     */
    public Ticket next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("No more elements in iterator");
        }
        return tickets[position++];
    }
}
