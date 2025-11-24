package org.example.progettoswam_cappugilemmo.domain_model;

public class ConcreteWorkoutPlanBuilder implements WorkoutPlanBuilder {

    private final WorkoutPlan workoutPlan = new WorkoutPlan(); //è final perchè non voglio che venga cambiato il riferimento

    @Override
    public ConcreteWorkoutPlanBuilder addExercise(Exercise exercise, int numSeries, int numRepetitions, double weight) {
        if (exercise == null) {
            throw new IllegalArgumentException("Exercise cannot be null");
        }
        workoutPlan.addExercise(new ExerciseWorkoutPlan(numSeries, numRepetitions, weight, exercise, this.workoutPlan));
        return this;
    }

    @Override
    public ConcreteWorkoutPlanBuilder setTrainer(PersonalTrainer pt){
        workoutPlan.setPersonalTrainerName(pt);
        return this;
    }
    @Override
    public WorkoutPlan buildWorkoutPlan() {
        return workoutPlan;
    }
}
