package DomainModel;

import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;

public class Course {
    private int id;
    private String name;
    private int numMembers;
    private int numMax;
    @OneToMany
    private ArrayList<Booking> bookings;
    @OneToMany
    private ArrayList<Occurrence> occurrences;

    public Course(int id, String name, int numMembers, int numMax) {
        this.id = id;
        this.name = name;
        this.numMembers = numMembers;
        this.numMax = numMax;
        this.bookings = new ArrayList<>();
        this.occurrences = new ArrayList<>();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumMembers() {
        return numMembers;
    }

    public void setNumMembers(int numMembers) {
        this.numMembers = numMembers;
    }

    public int getNumMax() {
        return numMax;
    }

    public void setNumMax(int numMax) {
        this.numMax = numMax;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

    public ArrayList<Occurrence> getOccurrences() {
        return occurrences;
    }

    public void setOccurrences(ArrayList<Occurrence> occurrences) {
        this.occurrences = occurrences;
    }
}
