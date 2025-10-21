package DomainModel;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Embeddable
public class Occurrence {
   /* @Id Se è Annotato come @Embeddable non può avere un Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOccurrence;*/

    private LocalDate date;

    private LocalTime hours;

    public Occurrence(LocalDate date, LocalTime hours) {
        this.date = date;
        this.hours = hours;

    }

    protected Occurrence() {

    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHours() {
        return hours;
    }

    public void setHours(LocalTime hours) {
        this.hours = hours;
    }
}
