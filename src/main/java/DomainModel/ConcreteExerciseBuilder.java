package DomainModel;

public class ConcreteExerciseBuilder implements ExerciseBuilder {
    private Exercise exercise;

    public ConcreteExerciseBuilder() {
        this.exercise = new Exercise();
    }

    @Override
    public ExerciseBuilder setName(String name) {
        exercise.setName(name);
        return this;
    }

    @Override
    public ExerciseBuilder setDescription(String description) {
        exercise.setDescription(description);
        return this;
    }

    @Override
    public ExerciseBuilder setNumSeries(int num_series) {
        return null;
    }

    @Override
    public ExerciseBuilder setNumRepetitions(int num_repetitions) {
        return null;
    }

    @Override
    public ExerciseBuilder setWeight(int weight) {
        return null;
    }

    @Override
    public ExerciseBuilder setDuration(int duration) {
        exercise.setDuration(duration);
        return this;
    }

    @Override
    public ExerciseBuilder setIntensity(String intensity) {
        exercise.setIntensity(intensity);
        return this;
    }

    @Override
    public Exercise build() {
        return exercise;
    }
}
