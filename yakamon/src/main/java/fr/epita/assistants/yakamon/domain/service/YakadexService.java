package fr.epita.assistants.yakamon.domain.service;

import fr.epita.assistants.yakamon.converter.YakadexModelConverter;
import fr.epita.assistants.yakamon.data.repository.YakadexEntryRepository;
import fr.epita.assistants.yakamon.domain.entity.YakadexEntryEntity;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class YakadexService {
    @jakarta.inject.Inject YakadexEntryRepository repository;
    @jakarta.inject.Inject YakadexModelConverter converter;
    public List<YakadexEntryEntity> retrieveAll(){
        var models = repository.getCatalog();
        return models.stream().map(converter::toEntity).collect(Collectors.toList());
    }

    public YakadexEntryEntity retrieveYakamon(int id){
        var models = repository.findById(id);
        return converter.toEntity(models);
    }
}
