package fr.epita.assistants.yakamon.presentation.rest;

import fr.epita.assistants.yakamon.converter.YakadexEntityConverter;
import fr.epita.assistants.yakamon.domain.entity.YakadexEntryEntity;
import fr.epita.assistants.yakamon.domain.service.YakadexService;
import fr.epita.assistants.yakamon.presentation.api.response.YakadexEntryResponse;
import fr.epita.assistants.yakamon.presentation.api.response.YakadexResponse;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.stream.Collectors;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class YakadexResource {
    @jakarta.inject.Inject
    YakadexService service;
    @jakarta.inject.Inject
    YakadexEntityConverter converter;


    @GET
    @Path("/yakadex")
    public YakadexResponse yakadexCatalog(){
        var entities = service.retrieveAll();

        List<YakadexEntryResponse> list = entities.stream().map(converter::toResponse).collect(Collectors.toList());
        YakadexResponse res = new YakadexResponse();
        res.entries = list;
        return res;
    }

    @GET
    @Path("/yakadex/{id}")
    public YakadexEntryResponse yakadexCatalog(@PathParam("id") int id){
        YakadexEntryEntity entity = service.retrieveYakamon(id);
        YakadexEntryResponse res = new YakadexEntryResponse();
        res.id = entity.id;
        res.caught = entity.caught;
        res.name = entity.name;
        res.evolutionId = entity.evolutionId;
        res.evolveThreshold = entity.evolveThreshold;
        res.description = entity.description;
        res.firstType = entity.firstType;
        res.secondType = entity.secondType;
        return res;
    }
}
