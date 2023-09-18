package dev.rohit.playerbotschemaspring.model.inheritance.singletype;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "single_ta")
@DiscriminatorValue("TA")
public class TA extends User {
    String startTime;
    String endTime;
}
