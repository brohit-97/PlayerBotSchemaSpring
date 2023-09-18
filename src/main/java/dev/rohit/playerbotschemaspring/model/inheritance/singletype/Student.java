package dev.rohit.playerbotschemaspring.model.inheritance.singletype;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity(name = "single_student")
@DiscriminatorValue("STUDENT")
public class Student extends User {
    double psp;
    String batchName;
}
