package dev.rohit.playerbotschemaspring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Bot extends  Player{
    Long rank;
}
