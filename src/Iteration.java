import java.time.LocalDate;
import java.util.ArrayList;

public class Iteration {

    private String goal;
    private LocalDate dateInit;
    private LocalDate dateEnd;
    private ArrayList<Activity> activites;

    public void countOpenActivities() {
        int a = activites.size();
        for(int i = 0; i<a; i++){
            activites.get(i).isActive()
        }
    }
}
