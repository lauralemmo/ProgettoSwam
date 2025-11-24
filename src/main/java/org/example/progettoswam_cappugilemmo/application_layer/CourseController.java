package org.example.progettoswam_cappugilemmo.application_layer;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.example.progettoswam_cappugilemmo.domain_model.Course;
import org.example.progettoswam_cappugilemmo.domain_model.Occurrence;
import org.example.progettoswam_cappugilemmo.repository_layer.CourseDAO;
import org.example.progettoswam_cappugilemmo.repository_layer.PersonalTrainerDAO;

import java.util.List;

public class CourseController {

    @Inject
    private CourseDAO courseDAO;
    @Inject
    private PersonalTrainerDAO personalTrainerDAO;

    @Transactional
    public void createNewCourse(String name, int maxMembers, List<Occurrence> dates) {
        Course course = new Course(name, 0, maxMembers);
        if (dates != null) {
            for (Occurrence date : dates) {
                course.getOccurrences().add(date);
            }
        }
        courseDAO.createCourse(course);
    }

    @Transactional
    public void deleteCourse(int courseId) {
        Course course = courseDAO.findById(courseId);
        if (course == null) {
            throw new IllegalArgumentException("Course not found");
        }
        courseDAO.deleteCourse(course);
    }

    @Transactional
    public void assignTrainerToCourse(int courseId, String personalTrainerCode) {
        Course course = courseDAO.findById(courseId);
        if (course == null) {
            throw new IllegalArgumentException("Course not found");
        }
        var personalTrainer = personalTrainerDAO.findById(personalTrainerCode);
        if (personalTrainer == null) {
            throw new IllegalArgumentException("Personal Trainer not found");
        }
        course.setPersonalTrainer(personalTrainer);
        courseDAO.updateCourse(course);
    }

    /// ////////////////////////////////////////////////////////////////////////////
    /// ////////////////////////    OCCURRENCES METHODS    ////////////////////////
    @Transactional
    public void addOccurenceToCourse(int courseId, Occurrence occurrence) {
        Course course = courseDAO.findById(courseId);
        if (course == null) {
            throw new IllegalArgumentException("Course not found");
        }
        course.getOccurrences().add(occurrence);
        courseDAO.updateCourse(course);
    }

    @Transactional
    public void removeOccurrenceFromCourse(int courseId, int occurrenceIndex) {
        Course course = courseDAO.findById(courseId);
        if (course == null) {
            throw new IllegalArgumentException("Course not found");
        }
        if (occurrenceIndex < 0 || occurrenceIndex >= course.getOccurrences().size()) {
            throw new IndexOutOfBoundsException("Occurrence index out of bounds");
        }
        else {
            courseDAO.updateCourse(course);
        }
    }
    @Transactional
    public void removeOccurrenceFromCourse(int courseId, Occurrence occurrence) {
        Course course = courseDAO.findById(courseId);
        if (course == null) {
            throw new IllegalArgumentException("Course not found");
        }
            for (Occurrence occ : course.getOccurrences()) {
                if (occ.equals(occurrence)) {
                    course.getOccurrences().remove(occ);
                    courseDAO.updateCourse(course);
                    return;
                }
            }
            throw new IllegalArgumentException("Occurrence not found in the course");
    }
    //aggiorna un'occorrenza specifica in base all'indice
    @Transactional
    public void updateOccurrence(int courseId, Occurrence occurrence, int occurrenceIndex) {
        Course course = courseDAO.findById(courseId);
        if (course == null) {
            throw new IllegalArgumentException("Course not found");
        }
        List<Occurrence> occurrences = course.getOccurrences();
        if (occurrenceIndex >= 0 && occurrenceIndex < occurrences.size()) {
            occurrences.set(occurrenceIndex, occurrence);
            courseDAO.updateCourse(course);
            return;
        }
        throw new IllegalArgumentException("Occurrence not found in the course");
    }



}
