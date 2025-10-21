package DomainModel;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Occurrence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOccurrence;

    @Temporal(TemporalType.DATE)
    private Date date;

    private String hours;

    public Occurrence(int idOccurrence, Date date, String hours) {
        this.idOccurrence = idOccurrence;
        this.date = date;
        this.hours = hours;
    }

    protected Occurrence() {

    }

    public int getIdOccurrence() {
        return idOccurrence;
    }

    public void setIdOccurrence(int idOccurrence) {
        this.idOccurrence = idOccurrence;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }
}
