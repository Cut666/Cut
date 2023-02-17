package com.example.quanlynhatro.model.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table
@Getter
@Setter
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "term_contract")
    private String termContract;
    @Column(name = "time_create")
    private Date timeCreate;
    @Column(name = "time_end")
    private Date timeEnd;
    private String status;
    @JsonManagedReference
    @ManyToOne
    @JoinColumn(name = "landLoed_id")
    private LandLord landLord2;
    @OneToOne
    @JoinColumn(name = "renter_id")
    private Renter renter;
    @OneToOne
    @JoinColumn(name = "room_id")
    private Room room;
}
