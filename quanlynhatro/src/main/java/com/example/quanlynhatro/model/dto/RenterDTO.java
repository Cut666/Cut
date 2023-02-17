package com.example.quanlynhatro.model.dto;

import com.example.quanlynhatro.model.entity.Room;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RenterDTO {
    private int id;
    private String name;
    private String phone;
    private Room room;
}
