package dev.rohit.playerbotschemaspring.model.inheritance.mapped;

import jakarta.persistence.Entity;

@Entity(name = "mapped_student")
public class Student extends User{
    double psp;
    String batchName;
}
