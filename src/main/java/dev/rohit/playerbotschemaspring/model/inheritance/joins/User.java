package dev.rohit.playerbotschemaspring.model.inheritance.joins;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity(name = "join_user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id

    Long id;
    String name;
    String email;
}
