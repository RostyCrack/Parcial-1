import java.time.LocalDate;
import java.util.ArrayList;

public class Group {
    private int id;
    private LocalDate cratedAt;
    private String name;
    private String area;
    private Student leader;
    private ArrayList<Student> members;
    private static ArrayList<Project> proyects;

    public static int countActiveProjects() {
        int p = proyects.size();

        for (int i = 0; i<p; i++){
            proyects.get(i).isActive();

        }
        return 0;
    }
}
