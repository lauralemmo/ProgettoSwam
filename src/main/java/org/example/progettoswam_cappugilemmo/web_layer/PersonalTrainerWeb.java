package org.example.progettoswam_cappugilemmo.web_layer;

import jakarta.inject.Inject;
import jakarta.ws.rs.Path;
import org.example.progettoswam_cappugilemmo.application_layer.PersonalTrainerController;
import org.example.progettoswam_cappugilemmo.domain_model.PersonalTrainer;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.core.MediaType;

@Path("/personaltrainers")
public class PersonalTrainerWeb {

    @Inject
    private PersonalTrainerController personalTrainerController;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void hirePersonalTrainer(PersonalTrainer personalTrainer) {
        // Delega tutto al service
        personalTrainerController.hirePersonalTrainer(personalTrainer);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void firePersonalTrainer(PersonalTrainer personalTrainer) {
        // Delega tutto al service
        personalTrainerController.firePersonalTrainer(personalTrainer);
    }
}
