package dev.rohit.playerbotschemaspring.model.inheritance.singletype;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "single_instructor")
@DiscriminatorValue("INSTRUCTOR")
public class Instructor extends User {
    double averageRating;
}
