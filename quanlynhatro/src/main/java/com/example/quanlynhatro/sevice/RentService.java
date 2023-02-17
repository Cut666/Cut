package com.example.quanlynhatro.sevice;

import com.example.quanlynhatro.model.dto.ContractDTO;
import com.example.quanlynhatro.model.entity.Contract;

public interface RentService {
    Contract createContract(ContractDTO dto);
}
