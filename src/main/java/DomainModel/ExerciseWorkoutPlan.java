package DomainModel;

import javax.persistence.ManyToOne;

public class ExerciseWorkoutPlan {

    private int numSeries;
    private int numRepetitions;
    private double weight;
    @ManyToOne
    private Exercise exercise;
    public ExerciseWorkoutPlan(Exercise exercise, int numSeries, int numRepetitions, double weight) {
        this.exercise = exercise;
        this.numSeries = numSeries;
        this.numRepetitions = numRepetitions;
        this.weight = weight;
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
