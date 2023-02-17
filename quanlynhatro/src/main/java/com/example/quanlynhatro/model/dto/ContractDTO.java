package com.example.quanlynhatro.model.dto;

import com.example.quanlynhatro.model.entity.LandLord;
import com.example.quanlynhatro.model.entity.Renter;
import com.example.quanlynhatro.model.entity.Room;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ContractDTO {
    private int id;
    private String termContract;
    private Date timeCreate;
    private Date timeEnd;
    private String status;
    private LandLord landLord2;
    private Renter renter;
    private Room room;
}
