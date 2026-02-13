package fr.epita.assistants.yakamon.converter;

import fr.epita.assistants.yakamon.domain.entity.YakadexEntryEntity;
import fr.epita.assistants.yakamon.presentation.api.response.YakadexEntryResponse;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class YakadexEntityConverter {
    public YakadexEntryResponse toResponse(YakadexEntryEntity entity){
        YakadexEntryResponse response = new YakadexEntryResponse();
        response.id = entity.id;
        response.caught = entity.caught;
        response.description = entity.description;
        response.name = entity.name;
        response.evolveThreshold = entity.evolveThreshold;
        response.firstType = entity.firstType;
        response.secondType = entity.secondType;
        response.evolutionId = entity.evolutionId;
        return response;
    }
}
