package org.example.progettoswam_cappugilemmo.application_layer;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.example.progettoswam_cappugilemmo.domain_model.*;
import org.example.progettoswam_cappugilemmo.repository_layer.ExerciseDAO;
import org.example.progettoswam_cappugilemmo.repository_layer.PersonalTrainerDAO;
import org.example.progettoswam_cappugilemmo.repository_layer.WorkoutPlanDAO;

import java.util.List;

public class WorkoutPlanController {

    @Inject
    private WorkoutPlanDAO workoutPlanDAO;
    @Inject
    private PersonalTrainerDAO personalTrainerDAO;
    @Inject
    private ExerciseDAO exerciseDAO;

    public static class ExerciseRequest {
        public String exerciseName;
        public int sets;
        public int reps;
        public double weight;

        public ExerciseRequest(String exerciseName, int sets, int reps, double weight) {
            this.exerciseName = exerciseName;
            this.sets = sets;
            this.reps = reps;
            this.weight = weight;
        }
    }

    @Transactional
    public void createWorkoutPlan( String personalTrainerTaxCode, List<ExerciseRequest> exercises) {
        PersonalTrainer pt = personalTrainerDAO.findById(personalTrainerTaxCode);
        if (pt == null) {
            throw new IllegalArgumentException("Personal Trainer not found with tax code: " + personalTrainerTaxCode);
        }
        ConcreteWorkoutPlanBuilder builder = new ConcreteWorkoutPlanBuilder();
        builder.setTrainer(pt);
        for (ExerciseRequest req : exercises) {
            Exercise exercise = exerciseDAO.getExerciseByName(req.exerciseName);
            if (exercise == null) {
                throw new IllegalArgumentException("Exercise not found: " + req.exerciseName);
            }
            builder.addExercise(exercise, req.sets, req.reps, req.weight);
        }
        WorkoutPlan workoutPlan = builder.buildWorkoutPlan();
        workoutPlanDAO.createWorkoutPlan(workoutPlan);
    }

}
