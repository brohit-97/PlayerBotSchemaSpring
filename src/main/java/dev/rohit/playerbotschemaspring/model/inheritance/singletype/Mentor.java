package dev.rohit.playerbotschemaspring.model.inheritance.singletype;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "single_mentor")
@DiscriminatorValue("MENTOR")
public class Mentor extends User {
    String averageRating;
}
