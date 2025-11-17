package org.example.progettoswam_cappugilemmo.repository_layer;
import org.example.progettoswam_cappugilemmo.domain_model.Exercise;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;


public class ExerciseDAO {

    @PersistenceContext
    private EntityManager em;

    public void aggiungi(Exercise e) {
        em.persist(e);
    }
    public List<Exercise> selectAll() {
        return em.createQuery("SELECT e FROM Exercise e", Exercise.class).getResultList();
    }

}
