package dev.rohit.playerbotschemaspring.model.inheritance.mapped;

import jakarta.persistence.Entity;

@Entity(name = "mapped_mentor")
public class Mentor extends User{
    String averageRating;
}
