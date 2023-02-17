package com.example.quanlynhatro.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Renter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String phone;
    private String cccd;
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;
}
