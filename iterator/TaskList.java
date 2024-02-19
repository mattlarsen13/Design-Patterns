package iterator;
/**
 * Represents a list of tasks in SCRUMBoard
 * @author Matt Larsen
 */
public class TaskList {
    private Ticket[] tickets;
    private int count;
    private String name;

    public TaskList(String name) {
        this.name = name;
        this.count = 0;
        this.tickets = new Ticket[100];
    }

    /**
     * Adds ticket to task list
     * @param ticket ticket to add
     */
    public void addTicket(Ticket ticket) {
        tickets[count++] = ticket;
    }

    /**
     * Adds ticket to SCRUM
     * @param name name of ticket
     * @param teamMember member assigned to ticket
     * @param difficulty difficulty of ticket
     */
    public void addTicket(String name, String teamMember, int difficulty) {
        Ticket ticket = new Ticket(name, teamMember, difficulty);
        addTicket(ticket);
    }

    /**
     * Returns new iterator of tickets
     * @return iterator of tickets
     */
    public Iterator createIterator() {
        return new TaskListIterator(tickets);
    }

    /**
     * Removes ticket from task list
     * @param ticket ticket to remove
     */
    public void removeTicket(Ticket ticket) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (tickets[i] == ticket) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < count - 1; i++) {
                tickets[i] = tickets[i + 1];
            }
            tickets[count - 1] = null;
            count--;
        }
    }

    /**
     * Gets ticket from task list by name
     * @param name name of ticket to get
     * @return the ticket with specified name
     */
    public Ticket getTicket(String name) {
        for (Ticket ticket : tickets) {
            if (ticket != null && ticket.getName().equals(name)) {
                return ticket;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
    for (int i = 0; i < count; i++) {
        sb.append("- ").append(tickets[i].getName()).append("(").append(tickets[i].getDifficulty()).append(") - ").append(tickets[i].getTeamMember()).append("\n");
    }
    return sb.toString();
    }
}
