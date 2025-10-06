package DomainModel;

import java.util.function.Consumer;

public class PersonalTrainer {
    private int salary;
    WorkoutPlanBuilder workoutPlanBuilder;
    private User user;
    WorkoutPlan workoutPlan;

    public PersonalTrainer(int salary, WorkoutPlanBuilder workoutPlanBuilder, User user) {
        this.user = user;
        this.salary = salary;
        this.workoutPlanBuilder = workoutPlanBuilder;
    }
    public PersonalTrainer(int salary, User user, WorkoutPlan workoutPlan) {
        this.user = user;
        this.salary = salary;
        this.workoutPlan = workoutPlan;
    }

    public int getSalary() {
        return salary;
    }

    // questo metodo andrà poi nella business logic
    public WorkoutPlan createPlan(WorkoutPlanBuilder workoutPlanBuilder, Consumer<WorkoutPlanBuilder> strategy) {
        workoutPlanBuilder.setTrainer(this.user.getName());
        strategy.accept(workoutPlanBuilder);
        return workoutPlanBuilder.buildWorkoutPlan();
    }

}

