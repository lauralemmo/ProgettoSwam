package org.example.progettoswam_cappugilemmo.repository_layer;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.example.progettoswam_cappugilemmo.domain_model.Course;

@ApplicationScoped
public class CourseDAO {

    @PersistenceContext
    private EntityManager em;

    public void createCourse(Object course) {
        em.persist(course);
    }
    public Course findById(int id) {
        return em.find(Course.class, id);
    }
    public void deleteCourse(Course course) {
        em.remove(em.contains(course) ? course : em.merge(course));
    }
    public void updateCourse(Course course) {
        em.merge(course); // Aggiorna l'entità nel database
    }


}
