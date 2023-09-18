package dev.rohit.playerbotschemaspring.model.inheritance.tableperclass;

import jakarta.persistence.Entity;

@Entity(name = "table_per_class_ta")
public class TA extends User {
    String startTime;
    String endTime;
}
