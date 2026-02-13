package fr.epita.assistants.yakamon.converter;

import fr.epita.assistants.yakamon.data.model.YakadexEntryModel;
import fr.epita.assistants.yakamon.domain.entity.YakadexEntryEntity;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class YakadexModelConverter {
    public YakadexEntryEntity toEntity(YakadexEntryModel model){
        return new YakadexEntryEntity(model.id,
                model.name,
                model.firstType,
                model.secondType,
                model.evolveThreshold!=null ? model.evolveThreshold : null,
                model.evolution!=null ? model.evolution.id : null,
                model.caught,
                model.description);
    }
}
