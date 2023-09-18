package dev.rohit.playerbotschemaspring.model.inheritance.joins;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity(name = "join_student")
@PrimaryKeyJoinColumn(name = "student_user_id")
public class Student extends User {
    double psp;
    String batchName;
}
