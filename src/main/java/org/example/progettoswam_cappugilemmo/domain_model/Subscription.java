package org.example.progettoswam_cappugilemmo.domain_model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Embeddable
public class Subscription {
/*    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSubscription;*/
    private LocalDate start_date;
    private LocalDate end_date;
    private String price;
    private String type;
    private boolean active;

    public Subscription(int idSubscription, LocalDate start_date, LocalDate end_date, String price, String type, boolean active) {
 //       this.idSubscription = idSubscription;
        this.start_date = start_date;
        this.end_date = end_date;
        this.price = price;
        this.type = type;
        this.active = active;
    }

    protected Subscription() {

    }

 /*   public int getIdSubscription() {
        return idSubscription;
    }*/

 /*   public void setIdSubscription(int idSubscription) {
        this.idSubscription = idSubscription;
    }*/

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public LocalDate getEnd_date() {
        return end_date;
    }

    public void setEnd_date(LocalDate end_date) {
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
