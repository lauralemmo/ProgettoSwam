package org.example.progettoswam_cappugilemmo.application_layer;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.example.progettoswam_cappugilemmo.domain_model.Exercise;
import org.example.progettoswam_cappugilemmo.repository_layer.PersonalTrainerDAO;

public class PersonalTrainerController {

    @Inject
    private PersonalTrainerDAO personalTrainerDAO;

    @Transactional
    public void aggiungiExercise(Exercise exercise) {}
}
