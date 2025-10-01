package DomainModel;

public interface ExerciseBuilder {

public ExerciseBuilder setName(String name);
public ExerciseBuilder setNumSeries(int num_series);
public ExerciseBuilder setNumRepetitions(int num_repetitions);
public ExerciseBuilder setWeight(int weight);

    Exercise build();
}
