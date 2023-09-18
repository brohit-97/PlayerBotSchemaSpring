package dev.rohit.playerbotschemaspring.model.inheritance.tableperclass;

import jakarta.persistence.Entity;

@Entity(name = "table_per_class_mentor")
public class Mentor extends User {
    String averageRating;
}
