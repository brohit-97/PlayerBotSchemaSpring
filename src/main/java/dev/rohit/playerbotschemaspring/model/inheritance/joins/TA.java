package dev.rohit.playerbotschemaspring.model.inheritance.joins;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "join_ta")
@PrimaryKeyJoinColumn(name = "ta_user_id")
public class TA extends User {
    String startTime;
    String endTime;
}
