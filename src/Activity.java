import java.util.ArrayList;

public class Activity {

    private String name;
    private String state;
    private int estimatedDuration;
    private ArrayList<Log> logs;

    public boolean isActive() {
        if (this.state.equals("Active")){
            return true;
        }
        else{
            return false;
        }
    }
}
