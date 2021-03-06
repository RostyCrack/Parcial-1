import java.time.LocalDate;
import java.util.ArrayList;

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
}
