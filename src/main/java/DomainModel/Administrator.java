package DomainModel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Administrator {
    private int idAdmin;
    private ArrayList<Course> courses;
    private ArrayList<PersonalTrainer> personalTrainers;

    public Administrator(int idAdmin) {
        this.idAdmin = idAdmin;
        this.courses = new ArrayList<>();
        this.personalTrainers = new ArrayList<>();
    }
}
