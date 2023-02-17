package com.example.quanlynhatro.sevice;

import com.example.quanlynhatro.model.dto.ContractDTO;
import com.example.quanlynhatro.model.entity.Contract;
import com.example.quanlynhatro.model.entity.LandLord;
import com.example.quanlynhatro.model.entity.Renter;
import com.example.quanlynhatro.model.entity.Room;
import com.example.quanlynhatro.repository.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

@Service
public class RentServiceImpl implements RentService{
    @Autowired
    PostRepositoy postRepositoy;
    @Autowired
    TypesRepository typesRepository;
    @Autowired
    LandLordRepository landLordRepository;
    @Autowired
    RoomRepository roomRepository;
    @Autowired
    RenterRepository renterRepository;
    @Autowired
    ContractPepository contractPepository;
    @Override
    public Contract createContract(ContractDTO dto) {
        Contract contract = new Contract();
        ModelMapper mapper = new ModelMapper();
        Renter renter = renterRepository.findByPhone(dto.getRenter().getPhone());
        if(renter != null){
            System.out.println("khach hang da thue tro");
            return null;
        }
        else {
            Renter renter1 = mapper.map(dto.getRenter(),Renter.class);
            renterRepository.save(renter1);
            contract.setRenter(renter1);
        }
        LandLord landLord = landLordRepository.findById(dto.getId()).get();
        contract.setLandLord2(landLord);
        Room room = roomRepository.findById(dto.getRoom().getId()).orElse(null);
        if (room==null){
            System.out.println("khong con phong");
            return null;
        }
        else {
            contract.setRoom(room);
        }
        Date currentDate = new Date(System.currentTimeMillis());
        System.out.println("Current: "+ currentDate);
        contract.setTimeCreate(currentDate);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DATE, 12);
        currentDate = calendar.getTime();
        System.out.println("Estimate: "+ currentDate);
        contract.setTimeEnd(currentDate);

        contractPepository.save(contract);

        return contract;
    }
}
