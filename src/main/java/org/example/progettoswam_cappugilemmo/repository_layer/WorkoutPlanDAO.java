package org.example.progettoswam_cappugilemmo.repository_layer;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.progettoswam_cappugilemmo.domain_model.WorkoutPlan;

@ApplicationScoped
public class WorkoutPlanDAO {
    @PersistenceContext
    private EntityManager em;
    public void createWorkoutPlan(WorkoutPlan workoutPlan) {
        if (workoutPlan == null) {
            throw new IllegalArgumentException("WorkoutPlan cannot be null");
        }
        em.persist(workoutPlan);
    }
}
