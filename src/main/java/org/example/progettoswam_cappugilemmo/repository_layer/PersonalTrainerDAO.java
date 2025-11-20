package org.example.progettoswam_cappugilemmo.repository_layer;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class PersonalTrainerDAO {

    @PersistenceContext
    private EntityManager em;


}
