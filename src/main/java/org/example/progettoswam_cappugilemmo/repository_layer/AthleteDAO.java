package org.example.progettoswam_cappugilemmo.repository_layer;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.progettoswam_cappugilemmo.domain_model.Athlete;

@ApplicationScoped
public class AthleteDAO {

    @PersistenceContext
    private EntityManager em;


    public boolean createAthlete(Athlete a){
        try{
            em.persist(a);
            System.out.println("atleta creato");
            return true;
        }
        catch(Exception e){
            System.out.println("creazione atleta fallita");
            return false;
        }
    }

    public Athlete getAthletebyUsername(String username){
        return em.find(Athlete.class, username);
    }
}
