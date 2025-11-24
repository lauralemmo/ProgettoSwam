package org.example.progettoswam_cappugilemmo.application_layer;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.example.progettoswam_cappugilemmo.domain_model.Exercise;
import org.example.progettoswam_cappugilemmo.repository_layer.CourseDAO;
import org.example.progettoswam_cappugilemmo.repository_layer.PersonalTrainerDAO;
import org.example.progettoswam_cappugilemmo.domain_model.PersonalTrainer;

public class PersonalTrainerController {

    @Inject
    private PersonalTrainerDAO personalTrainerDAO;
    /*@Inject
    private CourseDAO courseDAO;*/

    @Transactional
    public void hirePersonalTrainer(PersonalTrainer pt) {
        if (pt == null) {
            throw new IllegalArgumentException("PersonalTrainer cannot be null");
        }
        if (pt.getSalary() < 1200) {
            throw new IllegalArgumentException("Salary must be greater than 1200");
        }
        if (pt.isActive()){
            throw new IllegalArgumentException("PersonalTrainer must be inactive upon creation"); //il personal trainer probabilmente è gia stato assunto
        }
        personalTrainerDAO.createPersonalTrainer(pt);
        pt.setActive(true); //pt assunto
    }
    @Transactional
    public boolean firePersonalTrainer(PersonalTrainer pt) {

        if (pt == null) {
            throw new IllegalArgumentException("PersonalTrainer cannot be null");
        }

        if (personalTrainerDAO.findById(pt.getTax_code()) == null) {
            throw new IllegalArgumentException("PersonalTrainer not found");
        }

        if (!pt.isActive()) {
            throw new IllegalArgumentException("PersonalTrainer is already inactive");
        }
        pt.setActive(false); //pt licenziato
        personalTrainerDAO.deletePersonalTrainer(pt);
        return  true;
    }
    @Transactional
    public void updatePersonalTrainer(PersonalTrainer pt) {
        if (pt == null) {
            throw new IllegalArgumentException("PersonalTrainer cannot be null");
        }
        personalTrainerDAO.updatePersonalTrainer(pt);
    }
    @Transactional
    public PersonalTrainer getPersonalTrainerById(String id) {
        return personalTrainerDAO.findById(id);
    }

    /*@Transactional
    public void assignTrainerToCourse(int courseId, String personalTrainerCode) {
        var personalTrainer = personalTrainerDAO.findById(personalTrainerCode);
        if (personalTrainer == null) {
            throw new IllegalArgumentException("Personal Trainer not found");
        }
        var course = courseDAO.findById(courseId);
        if (course == null) {
            throw new IllegalArgumentException("Course not found");
        }
        course.setPersonalTrainer(personalTrainer);
        courseDAO.updateCourse(course);
    }*/ // fare in questo modo se vuoi che sia direttamente il personal trainer ad assegnarsi ai corsi


}
