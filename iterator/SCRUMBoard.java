package iterator; 
/**
 * Represents SCRUMBoard for managing tasks
 * @author Matt Larsen
 */
public class SCRUMBoard {
    private String projectName;
    private TaskList todo;
    private TaskList doing;
    private TaskList done;

    public SCRUMBoard(String projectName) {
        this.projectName = projectName;
        this.todo = new TaskList("To Do");
        this.doing = new TaskList("Doing");
        this.done = new TaskList("Done");
    }

    /**
     * Adds new ticket to TO DO List
     * @param name name of ticket
     * @param teamMember member assigned to ticket
     * @param difficulty difficulty of ticket
     */
    public void addTicket(String name, String teamMember, int difficulty) {
        todo.addTicket(name, teamMember, difficulty);
    }

    /**
     * Moves a ticket from TO DO to DOING
     * @param name name of ticket
     */
    public void startTicket(String name) {
        Ticket ticket = todo.getTicket(name);
        if (ticket != null) {
            todo.removeTicket(ticket);
            doing.addTicket(ticket);
        }
    }

    /**
     * Moves a ticket from DOING to DONE
     * @param name name of ticket
     */
    public void finishTicket(String name) {
        Ticket ticket = doing.getTicket(name);
        if (ticket != null) {
            doing.removeTicket(ticket);
            done.addTicket(ticket);
        }
    }

    @Override
    public String toString() {
        return String.format("***** %s ******\nToDo:\n%s\nDoing:\n%s\nDone:\n%s",
            projectName, todo, doing, done);       
    }
}
