package DomainModel;

import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class WorkoutPlan {
    private LocalDate date;
    @OneToMany
    private ArrayList<ExerciseWorkoutPlan> exercises;
    private String personalTrainer; // nome del personal trainer che ha creato il piano (è una stringa per semplicità)

    public WorkoutPlan(LocalDate date) {
        this.date = date;
        this.exercises = new ArrayList<>();
    }

    public WorkoutPlan(LocalDate date, String personalTrainer) {
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

    public void addExercise(ExerciseWorkoutPlan exercise) {
        this.exercises.add(exercise);
    }
    public void setPersonalTrainer(String personalTrainer) {
        this.personalTrainer = personalTrainer;
    }
    public void printWorkoutPlan() {
        System.out.println((personalTrainer != null ? "Personal Trainer: " + personalTrainer : "No Personal Trainer Assigned"));
        System.out.println("Date: " + date);
        System.out.println("Exercises:");
        for (ExerciseWorkoutPlan exercise : exercises) {
            System.out.println("- " + exercise.getExercise().getName()+ " : " + exercise.getNumSeries() + " sets of " + exercise.getNumRepetitions() + " reps "+ exercise.getWeight()+ " kg");
        }
    }
}
