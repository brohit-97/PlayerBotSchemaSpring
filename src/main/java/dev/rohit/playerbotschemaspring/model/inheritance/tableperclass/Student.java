package dev.rohit.playerbotschemaspring.model.inheritance.tableperclass;

import jakarta.persistence.Entity;

@Entity(name = "table_per_class_student")
public class Student extends User {
    double psp;
    String batchName;
}
