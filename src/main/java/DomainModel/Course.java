package DomainModel;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCourse;
    private String name;
    private int numMembers;
    private int numMax;
    @OneToMany
    private ArrayList<Booking> bookings;
    @OneToMany
    private ArrayList<Occurrence> occurrences;

    public Course(int idCourse, String name, int numMembers, int numMax) {
        this.idCourse = idCourse;
        this.name = name;
        this.numMembers = numMembers;
        this.numMax = numMax;
        this.bookings = new ArrayList<>();
        this.occurrences = new ArrayList<>();
    }


    public int getId() {
        return idCourse;
    }

    public void setId(int id) {
        this.idCourse = id;
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
