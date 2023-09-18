package dev.rohit.playerbotschemaspring.model.inheritance.mapped;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class User {

    @Id

    Long id;
    String name;
    String email;
}
