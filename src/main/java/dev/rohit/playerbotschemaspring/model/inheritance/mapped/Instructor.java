package dev.rohit.playerbotschemaspring.model.inheritance.mapped;

import jakarta.persistence.Entity;

@Entity(name = "mapped_instructor")
public class Instructor extends User{
    double averageRating;
}
