package fr.epita.assistants.yakamon.data.repository;

import fr.epita.assistants.yakamon.data.model.YakadexEntryModel;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class YakadexEntryRepository implements PanacheRepository<YakadexEntryModel> {
    public YakadexEntryModel findById(int id){
        return find("id", id).firstResult();
    }

    public List<YakadexEntryModel> getCatalog(){
        return listAll();
    }

    public YakadexEntryModel findYakamonById(int id){
        return find("id", id).firstResult();
    }
}
