package DomainModel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Course {
    private int id;
    private String name;
    private LocalDate date;
    private String hours;
    private int numMembers;
    private int numMax;
    private ArrayList <Booking> bookings;

    public Course(int id, String name, LocalDate date, String hours, int numMembers, int numMax) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.hours = hours;
        this.numMembers = numMembers;
        this.numMax = numMax;
        this.bookings = new ArrayList<>();
    }
}
