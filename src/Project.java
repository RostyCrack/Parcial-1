import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Project {

    private String name;
    private String goal;
    private LocalDate dateInit;
    private LocalDate dateEnd;
    private ArrayList<Iteration> iterations;
    private Group group;
    private ArrayList<Course> requirements;
    private Student leader;
    private ArrayList<Student> members;

    /**
     * Counts open activities of every iteration
     * @return # of open activites
     */
    public int countOpenActivities() {
        /*int activeActivities = 0;
        for (Iteration i : iterations) {
            activeActivities += i.countOpenActivities();
        }
        return activeActivities;
         */
        return this.iterations.stream().map(i->i.countOpenActivities())
                .reduce(0, (a,b) -> a+b);

    }

    /**
     * Evaluates if a project is active
     * @returs true or false
     */
    public boolean isActive(){
        boolean isActive;

        if (LocalDate.now().isAfter(this.dateEnd)){
            isActive = false;
        } else{
            int openActivities = this.countOpenActivities();
                isActive = openActivities > 0;
            }

        return isActive;
        }



    }
