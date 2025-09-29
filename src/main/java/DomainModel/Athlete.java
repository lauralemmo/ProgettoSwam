package DomainModel;

import java.util.ArrayList;

public class Athlete {
    private String height;
    private String weight;
    private User user;
    private Subscription subscription;
    private int workoutPlanId;
    private ArrayList<Booking> bookings;

    public Athlete(String height, String weight, User user, int workoutPlanId) {
        this.height = height;
        this.weight = weight;
        this.user = user;
        this.subscription = new Subscription();
        this.workoutPlanId = workoutPlanId;
        this.bookings = new ArrayList<>();
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public int getWorkoutPlanId() {
        return workoutPlanId;
    }

    public void setWorkoutPlanId(int workoutPlanId) {
        this.workoutPlanId = workoutPlanId;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }
}
