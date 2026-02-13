package fr.epita.assistants.yakamon.domain.entity;

import fr.epita.assistants.yakamon.utils.ElementType;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class YakadexEntryEntity {
    public int id;
    public String name;
    public ElementType firstType;
    public ElementType secondType;
    public Integer evolveThreshold;
    public Integer evolutionId;
    public boolean caught;
    public String description;
}
