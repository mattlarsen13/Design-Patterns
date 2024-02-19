package iterator; 
/**
 * Represents a task or ticket in a SCRUMBoard
 * @author Matt Larsen
 */
public class Ticket {
    private String name;
    private String teamMember;
    private int difficulty;

    /**
     * Constructs new Ticket with name, teamMember, difficulty
     * @param name name of ticket
     * @param teamMember team member assigned
     * @param difficulty difficulty level of ticket
     */
    public Ticket(String name, String teamMember, int difficulty) {
        this.name = name;
        this.teamMember = teamMember;
        this.difficulty = difficulty;
    }

    /**
     * Returns name of ticket
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns team member assigned to ticket
     * @return team member assigned
     */
    public String getTeamMember() {
        return teamMember;
    }

    /**
     * Returns difficulty level of ticket
     * @return difficulty level
     */
    public int getDifficulty() {
        return difficulty;
    }

    /**
     * Returns string representation of ticket
     * @return String representation of ticket
     */
    @Override
    public String toString() {
        return "Ticket{" + "name='" + name 
        + '\'' + ", teamMember='" + teamMember 
        + '\'' + ", difficulty=" + difficulty + '}';
    }
}
