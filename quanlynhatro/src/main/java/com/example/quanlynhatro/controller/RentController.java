package com.example.quanlynhatro.controller;

import com.example.quanlynhatro.model.dto.ContractDTO;
import com.example.quanlynhatro.repository.ContractPepository;
import com.example.quanlynhatro.sevice.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RentController {
@Autowired
RentService rentService;
@PostMapping("contact/insert")
    public ResponseEntity<?> createContact(@RequestBody ContractDTO dto){
    return ResponseEntity.ok(rentService.createContract(dto));
}
}
