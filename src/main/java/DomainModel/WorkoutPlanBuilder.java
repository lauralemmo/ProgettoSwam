package DomainModel;

public interface WorkoutPlanBuilder {
    ConcreteWorkoutPlanBuilder addExercise(String name, int numSeries, int numRepetitions, double weight);
    //ConcreteWorkoutPlanBuilder addName(String name);
    ConcreteWorkoutPlanBuilder setTrainer(String name);
    WorkoutPlan buildWorkoutPlan();
}
