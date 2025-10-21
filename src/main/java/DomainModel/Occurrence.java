package DomainModel;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Embeddable
public class Occurrence {
   /* @Id Se è Annotato come @Embeddable non può avere un Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOccurrence;*/

    private LocalDate date;

    private String hours;

    public Occurrence(LocalDate date, String hours) {
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

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }
}
