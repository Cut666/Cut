package com.example.quanlynhatro.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table
@Getter
@Setter
public class LandLord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String phone;
    @JsonBackReference
    @OneToMany(mappedBy = "landLord")
    private Set<Post>posts;
    @JsonBackReference
    @OneToMany(mappedBy = "landLord1")
    private Set<Room>rooms;
    @JsonBackReference
    @OneToMany(mappedBy = "landLord2")
    private Set<Contract> contracts;
}
