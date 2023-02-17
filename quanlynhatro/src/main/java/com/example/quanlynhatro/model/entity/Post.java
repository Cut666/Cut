package com.example.quanlynhatro.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String description;
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "landLoed_id")
    private LandLord landLord;
    @OneToOne
    @JoinColumn(name = "room_id")
    private Room room;
}
