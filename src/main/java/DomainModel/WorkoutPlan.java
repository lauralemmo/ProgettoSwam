package DomainModel;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

@Entity
public class WorkoutPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idWorkoutPlan;
    @Temporal(TemporalType.DATE)
    private Date date;
    @OneToMany
    private ArrayList<ExerciseWorkoutPlan> exercises;
    private String personalTrainerName; // nome del personal trainer che ha creato il piano (è una stringa per semplicità)

    public WorkoutPlan(Date date) {
        this.date = date;
        this.exercises = new ArrayList<>();
    }

    public WorkoutPlan(int idWorkoutPlan, Date date, String personalTrainerName) {
        this.idWorkoutPlan = idWorkoutPlan;
        this.personalTrainerName = personalTrainerName;
        this.date = date;
        this.exercises = new ArrayList<>();
    }

    public WorkoutPlan(String personalTrainer) {
        this.personalTrainerName = personalTrainer;
        this.exercises = new ArrayList<>();
    }

    protected WorkoutPlan() {
        this.exercises = new ArrayList<>();
    }




    public void addExercise(ExerciseWorkoutPlan exercise) {
        this.exercises.add(exercise);
    }

    public void printWorkoutPlan() {
        System.out.println((personalTrainerName != null ? "Personal Trainer: " + personalTrainerName : "No Personal Trainer Assigned"));
        System.out.println("Date: " + date);
        System.out.println("Exercises:");
        for (ExerciseWorkoutPlan exercise : exercises) {
            System.out.println("- " + exercise.getExercise().getName()+ " : " + exercise.getNumSeries() + " sets of " + exercise.getNumRepetitions() + " reps "+ exercise.getWeight()+ " kg");
        }
    }


    public int getIdWorkoutPlan() {
        return idWorkoutPlan;
    }

    public void setIdWorkoutPlan(int idWorkoutPlan) {
        this.idWorkoutPlan = idWorkoutPlan;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<ExerciseWorkoutPlan> getExercises() {
        return exercises;
    }

    public void setExercises(ArrayList<ExerciseWorkoutPlan> exercises) {
        this.exercises = exercises;
    }

    public String getPersonalTrainerName() {
        return personalTrainerName;
    }

    public void setPersonalTrainerName(String personalTrainerName) {
        this.personalTrainerName = personalTrainerName;
    }
}
