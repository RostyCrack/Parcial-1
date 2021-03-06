import java.time.LocalDate;
import java.util.ArrayList;

public class Iteration {

    private String goal;
    private LocalDate dateInit;
    private LocalDate dateEnd;
    private ArrayList<Activity> activites;

    public int countOpenActivities() {
        int a = activites.size();
        boolean active = false;
        int activeAct = 0;
        for(int i = 0; i<a; i++){
            if(activites.get(i).isActive()==true){
                activeAct += 1;
            }
        }
        return activeAct;
    }
}
