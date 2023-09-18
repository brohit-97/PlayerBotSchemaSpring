package dev.rohit.playerbotschemaspring.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Player {
    @Id
    @Column(name = "player_id")
    private Long id;

    private String name;

    private int age;
}
