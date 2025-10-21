package DomainModel;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.function.Consumer;

@Entity
public class PersonalTrainer extends User{
    private int salary;
    private boolean active;
    private LocalDate startDate;
    private LocalDate endDate;
    @OneToMany(mappedBy = "personalTrainer")
    private ArrayList<WorkoutPlan> workoutPlans;
    @OneToMany(mappedBy = "personalTrainer")
    private ArrayList<Course> courses;

    public PersonalTrainer(String name, String surname, String username, String password, String email, String phone_number, String tax_code,
                           LocalDate birth_date, int salary, boolean active, LocalDate startDate, LocalDate endDate, Date date, String personalTrainer) {
        super(name, surname, username, password, email, phone_number, tax_code, birth_date);
        this.salary = salary;
        this.active = active;
        this.startDate = startDate;
        this.endDate = endDate;
        this.workoutPlans = new ArrayList<>();
        this.courses = new ArrayList<>();
    }
    public PersonalTrainer(String name){
        super(name);
    }

    protected PersonalTrainer() {

    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public ArrayList<WorkoutPlan> getWorkoutPlans() {
        return workoutPlans;
    }

    public void setWorkoutPlans(ArrayList<WorkoutPlan> workoutPlans) {
        this.workoutPlans = workoutPlans;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    // questo metodo andrà poi nella business logic
    public WorkoutPlan createPlan(WorkoutPlanBuilder workoutPlanBuilder, Consumer<WorkoutPlanBuilder> strategy) {
        workoutPlanBuilder.setTrainer(this.getName());
        strategy.accept(workoutPlanBuilder);
        return workoutPlanBuilder.buildWorkoutPlan();
    }

}

