package DomainModel;

import java.time.LocalDate;

public class Booking {
    private int id;
    private LocalDate date;

    public Booking(int id, LocalDate date) {
        this.id = id;
        this.date = date;
    }
}
