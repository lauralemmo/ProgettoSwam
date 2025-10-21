package DomainModel;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBooking;
    @Temporal(TemporalType.DATE)
    private Date date;

    public Booking(int idBooking, Date date) {
        this.idBooking = idBooking;
        this.date = date;
    }

    protected Booking() {

    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
}
