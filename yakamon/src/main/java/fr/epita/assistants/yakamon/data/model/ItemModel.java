package fr.epita.assistants.yakamon.data.model;

import fr.epita.assistants.yakamon.utils.tile.ItemType;
import jakarta.persistence.*;

@Entity
@Table(name="item")
public class ItemModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Enumerated(EnumType.STRING)
    public ItemType type;

    public int quantity;
}

