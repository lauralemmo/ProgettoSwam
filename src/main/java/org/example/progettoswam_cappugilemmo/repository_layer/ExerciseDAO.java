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

    public void createExercise(Exercise e) {
        em.persist(e);
    }

    public Exercise getExerciseByName(String name) {
        return em.createQuery("SELECT e FROM Exercise e WHERE e.name = :name", Exercise.class)
                .setParameter("name", name)
                .getSingleResult();
    }







    public List<Exercise> selectAll() {
        return em.createQuery("SELECT e FROM Exercise e", Exercise.class).getResultList();
    }

}
