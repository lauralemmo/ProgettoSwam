package org.example.progettoswam_cappugilemmo.repository_layer;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.example.progettoswam_cappugilemmo.domain_model.PersonalTrainer;

import java.util.List;

@ApplicationScoped
public class PersonalTrainerDAO {

    @PersistenceContext
    private EntityManager em;


    public PersonalTrainer findById(String id) {
        return em.find(PersonalTrainer.class, id);
    }
    public void createPersonalTrainer(PersonalTrainer pt) {
        em.persist(pt);
    }
    public void deletePersonalTrainer(PersonalTrainer pt) {
        em.remove(em.contains(pt) ? pt : em.merge(pt)); // Assicura che l'entità sia gestita prima di rimuoverla
    }
    public void updatePersonalTrainer(PersonalTrainer pt) {
        em.merge(pt);
    }
}
