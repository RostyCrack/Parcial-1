import java.util.ArrayList;

public class Activity {

    private String name;
    private String state;
    private int estimatedDuration;
    private ArrayList<Log> logs;

    /**
     * Evaluates if an activity is active
     *
     * @returns true or false
     */

    public boolean isActive() {
        return this.state.equalsIgnoreCase("Active") ||
                this.state.equalsIgnoreCase("Pending");
    }




}
