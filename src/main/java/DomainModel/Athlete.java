package DomainModel;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDate;
import java.util.ArrayList;

@Entity
public class Athlete extends User {
    private String height;
    private String weight;
    @OneToOne
    private Subscription subscription;
    @OneToOne
    private WorkoutPlan workoutPlan;
    @OneToMany
    private ArrayList<Booking> bookings;

    public Athlete(String name, String surname, String username, String password, String email, String phone_number, String tax_code,
                   LocalDate birth_date, String height, String weight, int idSubscription, LocalDate start_date, LocalDate end_date, String price, String type, boolean active, int idWorkoutPlan, LocalDate date, String personalTrainer) {
        super(name, surname, username, password, email, phone_number, tax_code, birth_date);
        this.height = height;
        this.weight = weight;
        this.subscription = new Subscription(idSubscription, start_date, end_date, price, type, active);
        this.workoutPlan = new WorkoutPlan(idWorkoutPlan, date, personalTrainer);
        this.bookings = new ArrayList<>();
    }

    protected Athlete() {
        super();
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public WorkoutPlan getWorkoutPlan() {
        return workoutPlan;
    }

    public void setWorkoutPlan(WorkoutPlan workoutPlan) {
        this.workoutPlan = workoutPlan;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }
}
