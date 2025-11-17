package org.example.progettoswam_cappugilemmo.domain_model;

public class main{
    public static void main(String[] args) {
    /*    WorkoutPlanBuilder workoutPlanBuilder = new ConcreteWorkoutPlanBuilder();
        PersonalTrainer personalTrainer = new PersonalTrainer(50000, workoutPlanBuilder);
        System.out.println("Personal Trainer Salary: " + personalTrainer.getSalary());
        workoutPlanBuilder.addExercise("Squat", 4, 10, 60.0)
                            .addExercise("Bench Press", 3, 8, 40.0)
                            .addExercise("Deadlift", 5, 5, 80.0);
        WorkoutPlan workoutPlan = workoutPlanBuilder.buildWorkoutPlan();
        workoutPlan.printWorkoutPlan();*/
        PersonalTrainer personalTrainer = new PersonalTrainer("John");
        try {
            WorkoutPlanBuilder workoutPlanBuilder = new ConcreteWorkoutPlanBuilder();
            Exercise exercise1 = new Exercise("Squat", "Leg exercise Strength");
            Exercise exercise2 = new Exercise("Bench Press", "Chest exercise Strength");
            Exercise exercise3 = new Exercise("Deadlift", "Back exercise Strength");
            WorkoutPlan workoutPlan1 = personalTrainer.createPlan(workoutPlanBuilder, builder -> {
                builder.addExercise(exercise1, 4, 10, 60.0)
                       .addExercise(exercise2, 3, 8, 40.0)
                       .addExercise(exercise3, 5, 5, 80.0);
            });
            workoutPlan1.printWorkoutPlan();
            System.out.println("-----");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
