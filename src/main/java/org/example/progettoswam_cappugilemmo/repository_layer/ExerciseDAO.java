package org.example.progettoswam_cappugilemmo.repository_layer;
import jakarta.enterprise.context.ApplicationScoped;
import org.example.progettoswam_cappugilemmo.domain_model.Exercise;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@ApplicationScoped
public class ExerciseDAO {

    @PersistenceContext
    private EntityManager em;


    public boolean createExercise(Exercise e) {
        try{
            em.persist(e);
            System.out.println("nuovo esercizio creato con successo");
            return true;
        }
        catch(Exception ex){
            System.out.println("creazione esercizio non riuscita");
            return false;
        }
    }


    public Exercise getExerciseByName(String name) {
        return em.createQuery("SELECT e FROM Exercise e WHERE e.name = :name", Exercise.class)
                .setParameter("name", name)
                .getSingleResult();
    }


    public List<Exercise> getAllExercises(){
        return em.createQuery("SELECT e FROM Exercise e", Exercise.class).getResultList();
    }


    /*public Exercise getExerciseByName(String name){
        em.find(Exercise.class, name);
    }*/


    public boolean updateExercise(Exercise e) {
        try{
            em.merge(e);
            System.out.println("modifica avvenuta");
            return true;
        }
        catch(Exception ex){
            System.out.println("modifica non riuscita");
            return false;
        }
    }


    public boolean deleteExercise(Exercise e) {
        try{
            em.remove(e);
            System.out.println("cancellazione esercizio avvenuta con successo");
            return true;
        }
        catch(Exception ex){
            System.out.println("cancellazione non riuscita");
            return false;
        }
    }


}
