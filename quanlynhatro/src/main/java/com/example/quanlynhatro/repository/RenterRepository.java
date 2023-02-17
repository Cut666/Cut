package com.example.quanlynhatro.repository;

import com.example.quanlynhatro.model.entity.Renter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RenterRepository extends JpaRepository<Renter,Integer> {
    Renter findByPhone(String phone);
}
