package fr.epita.assistants.yakamon.data.model;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Table(name="player")
public class PlayerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    public UUID uuid;

    @Column(length = 20)
    public String name;

    @Column(name="pos_x")
    public int posX;

    @Column(name="pos_y")
    public int posY;

    @Column(name="last_move")
    public Timestamp lastMove;

    @Column(name="last_catch")
    public Timestamp lastCatch;

    @Column(name="last_collect")
    public Timestamp lastCollect;

    @Column(name="last_feed")
    public Timestamp lastFeed;
}

