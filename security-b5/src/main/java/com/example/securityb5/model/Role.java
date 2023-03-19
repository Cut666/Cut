package com.example.securityb5.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
@Getter
@Setter
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @ManyToMany
    @JoinTable(name = "Role_user",joinColumns = @JoinColumn(name = "role_id"),inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> users;
}
