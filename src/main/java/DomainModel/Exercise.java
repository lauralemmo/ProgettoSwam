package DomainModel;

public class Exercise {
    private String name;
    private int numSeries;
    private int numRepetitions;
    private double weight;

    public Exercise(String name, int numSeries, int numRepetitions, double weight) {
        this.name = name;
        this.numSeries = numSeries;
        this.numRepetitions = numRepetitions;
        this.weight = weight;
    }

//metodi getter e setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "name='" + name + '\'' +
                ", numSeries=" + numSeries +
                ", numRepetitions=" + numRepetitions +
                ", weight=" + weight +
                '}';
    }
}
