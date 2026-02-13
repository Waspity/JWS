package fr.epita.assistants.yakamon.data.model;

import fr.epita.assistants.yakamon.utils.ElementType;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="yakamon")
public class YakamonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    public UUID uuid;

    @Column(length = 20)
    public String nickname;

    @Column(name="energy_points")
    public int energyPoints;

    @Column(name="yakadex_entry_id")
    public int yakadexEntryId;
}

