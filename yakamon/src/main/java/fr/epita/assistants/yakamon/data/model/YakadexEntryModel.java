package fr.epita.assistants.yakamon.data.model;

import fr.epita.assistants.yakamon.utils.ElementType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="yakadex_entry")
@Setter
@Getter
public class YakadexEntryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(length = 20)
    public String name;

    public boolean caught;

    @Enumerated(EnumType.STRING)
    @Column(name="first_type")
    public ElementType firstType;

    @Enumerated(EnumType.STRING)
    @Column(name="second_type")
    public ElementType secondType;

    public String description;

    @OneToOne
    @JoinColumn(name="evolution_id")
    public YakadexEntryModel evolution;

    @Column(name="evolve_threshold")
    public Integer evolveThreshold;
}
