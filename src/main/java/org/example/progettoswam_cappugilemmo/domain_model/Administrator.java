package org.example.progettoswam_cappugilemmo.domain_model;
import jakarta.persistence.*;

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
