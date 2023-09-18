package dev.rohit.playerbotschemaspring.model.inheritance.singletype;

import jakarta.persistence.*;

@Entity(name = "single_type_user")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user_type")
@DiscriminatorValue("USER")
public class User {

    @Id

    Long id;
    String name;
    String email;
}
