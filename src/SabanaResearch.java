import java.time.LocalDate;
import java.util.ArrayList;

public class SabanaResearch {

    private ArrayList<Group> groups;
    private LocalDate currentDate;
    private ArrayList<Summary> summaries;

    public String inscribeStudent(){

        return ":v";
    }

    /**
     * Creates a summary entry
     */
    public void createSummaryEntry(){
        /*int g = groups.size();
        for (int i = 0; i<g;i++){
            int ap;
            ap = Group.countActiveProjects();

            new Summary(currentDate, ap);
        }
         */

        int activeProjects = this.groups.stream().map(g->g.countActiveProjects())
                .reduce(0,(a,b)->a+b);

        Summary summary = new Summary(currentDate, activeProjects);
        this.summaries.add(summary);
    }


}
