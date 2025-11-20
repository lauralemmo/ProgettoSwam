package org.example.progettoswam_cappugilemmo.application_layer;
import jakarta.transaction.Transactional;
import org.example.progettoswam_cappugilemmo.domain_model.Exercise;
import jakarta.inject.Inject;
import org.example.progettoswam_cappugilemmo.repository_layer.ExerciseDAO;

public class ExerciseController {

    @Inject //il server inietta automaticamente l'istanza di ExerciseDAO
    private ExerciseDAO exerciseDAO;


    @Transactional //apre e chiude la transazione automaticamente
    public void createExercise(String name, String description) {
        Exercise newExercise = new Exercise(name, description);
        exerciseDAO.aggiungi(newExercise);
    }

}
