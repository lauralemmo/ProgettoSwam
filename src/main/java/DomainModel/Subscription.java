package DomainModel;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSubscription;
    @Temporal(TemporalType.DATE)
    private Date start_date;
    @Temporal(TemporalType.DATE)
    private Date end_date;
    private String price;
    private String type;
    private boolean active;

    public Subscription(int idSubscription, Date start_date, Date end_date, String price, String type, boolean active) {
        this.idSubscription = idSubscription;
        this.start_date = start_date;
        this.end_date = end_date;
        this.price = price;
        this.type = type;
        this.active = active;
    }

    protected Subscription() {

    }

    public int getIdSubscription() {
        return idSubscription;
    }

    public void setIdSubscription(int idSubscription) {
        this.idSubscription = idSubscription;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
