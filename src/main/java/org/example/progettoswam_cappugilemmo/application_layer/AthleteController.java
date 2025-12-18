package org.example.progettoswam_cappugilemmo.application_layer;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.example.progettoswam_cappugilemmo.domain_model.Athlete;
import org.example.progettoswam_cappugilemmo.domain_model.Exercise;
import org.example.progettoswam_cappugilemmo.repository_layer.AthleteDAO;

import java.time.LocalDate;
import java.util.List;

public class AthleteController {

    @Inject
    private AthleteDAO athleteDAO;


    @Transactional
    public boolean addAthlete(String name, String surname, String username, String password, String email, String phone_number,
                              String taxcode, LocalDate birthdate, String height, String weight, int idSubscription,
                              LocalDate start_date, LocalDate end_date, String price, String type, boolean active, int idWorkoutPlan,
                              LocalDate date, String personalTrainer
                              ) {
        Athlete athlete = new Athlete(name, surname, username, password, email, phone_number, taxcode, birthdate, height, weight,
                idSubscription, start_date, end_date, price, type, active, idWorkoutPlan, date, personalTrainer);
        return athleteDAO.createAthlete(athlete);
    }


    @Transactional
    public Athlete searchAthleteByUsername(String username) {
        Athlete athlete = athleteDAO.getAthletebyUsername(username);

        if(athlete != null){
            return athlete;
        }
        else
            throw new IllegalArgumentException("Atleta non trovato");
    }


    @Transactional
    public List<Athlete> getAllAthletes(){
        return athleteDAO.getAllAthletes();
    }


    @Transactional
    public boolean updateAthlete(Athlete athlete){
        return athleteDAO.updateAthlete(athlete);
    }


    @Transactional
    public boolean removeAthlete(Athlete athlete){
        return athleteDAO.deleteAthlete(athlete);
    }
}
