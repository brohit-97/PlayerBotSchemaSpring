package dev.rohit.playerbotschemaspring.model.inheritance.joins;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "join_instructor")
@PrimaryKeyJoinColumn(name = "instructor_user_id")
public class Instructor extends User {
    double averageRating;
}
