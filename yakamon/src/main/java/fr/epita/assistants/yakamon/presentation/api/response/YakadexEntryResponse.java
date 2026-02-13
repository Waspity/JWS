package fr.epita.assistants.yakamon.presentation.api.response;

import fr.epita.assistants.yakamon.utils.ElementType;


public class YakadexEntryResponse {
    public int id;
    public String name;
    public ElementType firstType;
    public ElementType secondType;
    public Integer evolveThreshold;
    public Integer evolutionId;
    public boolean caught;
    public String description;
}
