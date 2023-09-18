package dev.rohit.playerbotschemaspring.model.inheritance.tableperclass;

import jakarta.persistence.Entity;

@Entity(name = "table_per_class_instructor")
public class Instructor extends User {
    double averageRating;
}
