package dev.rohit.playerbotschemaspring.model.inheritance.joins;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "join_mentor")
@PrimaryKeyJoinColumn(name = "mentor_user_id")
public class Mentor extends User {
    String averageRating;
}
