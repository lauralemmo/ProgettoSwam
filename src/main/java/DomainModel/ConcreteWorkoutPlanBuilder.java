package DomainModel;

public class ConcreteWorkoutPlanBuilder implements WorkoutPlanBuilder {

    private final WorkoutPlan workoutPlan = new WorkoutPlan(); //è final perchè non voglio che venga cambiato il riferimento

    @Override
    public ConcreteWorkoutPlanBuilder addExercise(Exercise exercise, int numSeries, int numRepetitions, double weight) {
        workoutPlan.addExercise(new ExerciseWorkoutPlan(exercise, numSeries, numRepetitions, weight));
        return this;
    }

    public ConcreteWorkoutPlanBuilder setTrainer(String name){
        workoutPlan.setPersonalTrainer(name);
        return this;
    }
    @Override
    public WorkoutPlan buildWorkoutPlan() {
        return workoutPlan;
    }
}
