package org.example.progettoswam_cappugilemmo.DomainModel;

public interface WorkoutPlanBuilder {
    ConcreteWorkoutPlanBuilder addExercise(Exercise exercise, int numSeries, int numRepetitions, double weight);
    //ConcreteWorkoutPlanBuilder addName(String name);
    ConcreteWorkoutPlanBuilder setTrainer(String name);
    WorkoutPlan buildWorkoutPlan();
}
