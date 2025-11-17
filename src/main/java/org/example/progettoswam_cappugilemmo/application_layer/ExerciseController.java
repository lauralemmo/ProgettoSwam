package org.example.progettoswam_cappugilemmo.application_layer;
import jakarta.transaction.Transactional;
import org.example.progettoswam_cappugilemmo.domain_model.Exercise;
import jakarta.inject.Inject;
import org.example.progettoswam_cappugilemmo.repository_layer.ExerciseDAO;

public class ExerciseController {

    @Inject
    Exercise exercise;
    private ExerciseDAO exerciseDAO;

    ExerciseController() {
        exerciseDAO = new ExerciseDAO();
    }

    @Transactional
    public void createExercise(String name, String description) {
        Exercise newExercise = new Exercise(name, description);
        exerciseDAO.aggiungi(newExercise);
    }

}
