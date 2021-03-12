import java.time.LocalDate;

public class Summary {

    private LocalDate date;
    private int activeProjects;
    private int openActivities;
    private int closeActivities;


    public Summary(LocalDate currentDate, int ap) {
        currentDate = this.date;
        ap = this.activeProjects;
    }
}
