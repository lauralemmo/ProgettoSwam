package DomainModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Exercise {

    private Long id;

    private String name;
    private String description;
    public Exercise(String name) {
        this.name = name;
    }
    public Exercise(String name, String description) {
        this.name = name;
        this.description = description;
    }
//metodi getter e setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
