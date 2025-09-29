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
}
