package DomainModel;

import java.util.ArrayList;
import java.util.Date;

public class WorkoutPlan {
    private int id;
    private Date date;
    private ArrayList<Exercise> exercises;

    public WorkoutPlan(int id, Date date) {
        this.id = id;
        this.date = date;
        this.exercises = new ArrayList<>();
    }
}
