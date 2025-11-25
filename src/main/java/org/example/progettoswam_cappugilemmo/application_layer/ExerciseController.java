package org.example.progettoswam_cappugilemmo.application_layer;
import jakarta.transaction.Transactional;
import org.example.progettoswam_cappugilemmo.domain_model.Exercise;
import jakarta.inject.Inject;
import org.example.progettoswam_cappugilemmo.repository_layer.ExerciseDAO;

import java.util.ArrayList;
import java.util.List;

public class ExerciseController {

    @Inject //il server inietta automaticamente l'istanza di ExerciseDAO
    private ExerciseDAO exerciseDAO;


    @Transactional //apre e chiude la transazione automaticamente
    public boolean addExercise(String name, String description) {
        Exercise exercise = new Exercise(name, description);
        return exerciseDAO.createExercise(exercise);
    }


    @Transactional
    public Exercise searchExerciseByName(String name) {
        Exercise exercise = exerciseDAO.getExerciseByName(name);

        if(exercise != null){
            return exercise;
        }
        else
            throw new IllegalArgumentException("Esercizio non trovato");
    }


    @Transactional
    public List<Exercise> getAllExercises() {
        return exerciseDAO.getAllExercises();
    }


    @Transactional
    public boolean updateExercise(Exercise exercise){
        return exerciseDAO.updateExercise(exercise);
    }

    @Transactional
    public boolean removeExercise(Exercise exercise){
        return exerciseDAO.deleteExercise(exercise);
    }

}
