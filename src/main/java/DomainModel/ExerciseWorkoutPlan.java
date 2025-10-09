package DomainModel;

import javax.persistence.*;

@Entity
public class ExerciseWorkoutPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEW;
    private int numSeries;
    private int numRepetitions;
    private double weight;
    @ManyToOne
    private Exercise exercise;

    public ExerciseWorkoutPlan(int idEW, int numSeries, int numRepetitions, double weight, Exercise exercise) {
        this.idEW = idEW;
        this.numSeries = numSeries;
        this.numRepetitions = numRepetitions;
        this.weight = weight;
        this.exercise = exercise;
    }

    public int getIdEW() {
        return idEW;
    }

    public void setIdEW(int idEW) {
        this.idEW = idEW;
    }

    public int getNumSeries() {
        return numSeries;
    }

    public void setNumSeries(int numSeries) {
        this.numSeries = numSeries;
    }

    public int getNumRepetitions() {
        return numRepetitions;
    }

    public void setNumRepetitions(int numRepetitions) {
        this.numRepetitions = numRepetitions;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public Exercise getExercise() {
        return exercise;
    }
    @Override
    public String toString() {
        return "Exercise{" +
                "name='" + exercise.getName() + '\'' +
                ", numSeries=" + numSeries +
                ", numRepetitions=" + numRepetitions +
                ", weight=" + weight +
                '}';
    }
}
