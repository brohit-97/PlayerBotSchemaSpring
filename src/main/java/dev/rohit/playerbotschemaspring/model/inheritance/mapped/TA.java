package dev.rohit.playerbotschemaspring.model.inheritance.mapped;

import jakarta.persistence.Entity;

@Entity(name = "mappped_ta")
public class TA extends User{
    String startTime;
    String endTime;
}
