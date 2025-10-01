package DomainModel;

import java.util.ArrayList;
import java.util.Date;

public class WorkoutPlan {
    private Date date;
    private ArrayList<Exercise> exercises;
    private String personalTrainer;

    public WorkoutPlan(Date date) {
        this.date = date;
        this.exercises = new ArrayList<>();
    }

    public WorkoutPlan(Date date, String personalTrainer) {
        this.personalTrainer = personalTrainer;
        this.date = date;
        this.exercises = new ArrayList<>();
    }
    public WorkoutPlan(String personalTrainer) {
        this.personalTrainer = personalTrainer;
        this.exercises = new ArrayList<>();
    }

    public WorkoutPlan() {
        this.exercises = new ArrayList<>();
    }

    public void addExercise(Exercise exercise) {
        this.exercises.add(exercise);
    }
    public void setPersonalTrainer(String personalTrainer) {
        this.personalTrainer = personalTrainer;
    }
    public void printWorkoutPlan() {
        System.out.println((personalTrainer != null ? "Personal Trainer: " + personalTrainer : "No Personal Trainer Assigned"));
        System.out.println("Date: " + date);
        System.out.println("Exercises:");
        for (Exercise exercise : exercises) {
            System.out.println("- " + exercise.getName()+ " : " + exercise.getNumSeries() + " sets of " + exercise.getNumRepetitions() + " reps "+ exercise.getWeight()+ " kg");
        }
    }
}
