package DomainModel;

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
        User user = new User("John Doe");
        PersonalTrainer personalTrainer = new PersonalTrainer(50000, user);
        try {
            WorkoutPlanBuilder workoutPlanBuilder = new ConcreteWorkoutPlanBuilder();
            WorkoutPlan workoutPlan1 = personalTrainer.createPlan(workoutPlanBuilder, builder -> {
                builder.addExercise("Squat", 4, 10, 60.0)
                       .addExercise("Bench Press", 3, 8, 40.0)
                       .addExercise("Deadlift", 5, 5, 80.0);
            });
            workoutPlan1.printWorkoutPlan();
            System.out.println("-----");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
