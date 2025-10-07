package DomainModel;

import java.time.LocalDate;

public class Occurrence {
    private LocalDate date;
    private String hours;

    public Occurrence(LocalDate date, String hours) {
        this.date = date;
        this.hours = hours;
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
