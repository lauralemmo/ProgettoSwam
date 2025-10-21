package DomainModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.ArrayList;

@Entity
public class Administrator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAdmin;
    private ArrayList<Course> courses;
    private ArrayList<PersonalTrainer> personalTrainers;

    public Administrator(int idAdmin) {
        this.idAdmin = idAdmin;
        this.courses = new ArrayList<>();
        this.personalTrainers = new ArrayList<>();
    }

    protected Administrator() {

    }
}
