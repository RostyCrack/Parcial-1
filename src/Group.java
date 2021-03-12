import java.time.LocalDate;
import java.util.ArrayList;

public class Group {
    private int id;
    private LocalDate cratedAt;
    private String name;
    private String area;
    private Student leader;
    private ArrayList<Student> members;
    private ArrayList<Project> projects;

    public int countActiveProjects() {
        /* int p = proyects.size();
        int ap = 0;
        for (int i = 0; i<p; i++){
            if(proyects.get(i).isActive()){
                ap+=1;
            }
        }
        return ap;
         */

        return (int) this.projects.stream().map(p->p.isActive())
                .filter(b -> b).count();
    }


}
