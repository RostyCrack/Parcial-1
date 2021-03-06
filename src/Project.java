import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Project {

    private String name;
    private String goal;
    private LocalDate dateInit;
    private LocalDate dateEnd;
    private HashMap<Iteration, Activity> iterations;
    private Group group;
    private ArrayList<Course> requirements;
    private Student leader;
    private ArrayList<Student> members;

    public void isActive() {
        int i = iterations.size();
        for (int g = 0; g<i; g++){
            iterations.get(g).countOpenActivities();
        }
    }
}
