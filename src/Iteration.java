import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Iteration {

    private String goal;
    private LocalDate dateInit;
    private LocalDate dateEnd;
    private ArrayList<Activity> activities;


    /**
     *
     * @returns number of Open Activities of an iteration
     */
    public int countOpenActivities() {

        /* boolean active = false;
        int activeAct = 0;

        for (Activity activity : this.activities) {
            if (activity.isActive()) {
                activeAct += 1;
            }
        }
        return activeAct;
           */
        return (int) this.activities.stream()
                .map(activity->activity.isActive())
                .filter(b->b).count();
    }
}
