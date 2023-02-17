package com.example.quanlynhatro.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table
@Getter
@Setter
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String available;
    private double price;
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "landLoed_id")
    private LandLord landLord1;
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "type_id")
    private Types types;
    @JsonBackReference
    @OneToMany(mappedBy = "room")
    private Set<Renter> renters;
}
