package com.example.quanlynhatro.model.dto;

import com.example.quanlynhatro.model.entity.Contract;
import com.example.quanlynhatro.model.entity.Post;
import com.example.quanlynhatro.model.entity.Room;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LandLordDTO {
    private int id;
    private String name;
    private String phone;
    private Set<Post> posts;
    private Set<Room>rooms;
    private Set<Contract> contracts;
}
