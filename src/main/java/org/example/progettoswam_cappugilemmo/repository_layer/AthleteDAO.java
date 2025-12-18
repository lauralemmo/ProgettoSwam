package org.example.progettoswam_cappugilemmo.repository_layer;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.progettoswam_cappugilemmo.domain_model.Athlete;

import java.util.List;

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

    public List<Athlete> getAllAthletes(){
        return em.createQuery("SELECT a FROM Athlete a", Athlete.class).getResultList();
    }

    public boolean updateAthlete(Athlete a){
        try{
            em.merge(a);
            System.out.println("modifica avvenuta");
            return true;
        }
        catch(Exception ex){
            System.out.println("modifica non riuscita");
            return false;
        }
    }

    public boolean deleteAthlete(Athlete a){
        try{
            em.remove(a);
            System.out.println("cancellazione atleta avvenuta con successo");
            return true;
        }
        catch(Exception ex){
            System.out.println("cancellazione non riuscita");
            return false;
        }
    }

}
