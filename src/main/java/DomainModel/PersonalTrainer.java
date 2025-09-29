package DomainModel;

import java.util.ArrayList;

public class PersonalTrainer {
    private int salary;
    private User user;
    private ArrayList<Course> courses;
    private ArrayList<Integer> workoutPlanId;

    public PersonalTrainer(int salary, User user, int workoutPlanId) {
        this.salary = salary;
        this.user = user;
        this.courses = new ArrayList<>();
        this.workoutPlanId = new ArrayList<>();
    }
}
