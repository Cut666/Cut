package com.example.quanlynhatro;

import com.example.quanlynhatro.model.entity.*;
import com.example.quanlynhatro.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;

@SpringBootApplication
public class QuanlynhatroApplication implements CommandLineRunner {
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
    public static void main(String[] args) {
        SpringApplication.run(QuanlynhatroApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        Types types = new Types();
//        types.setName("Phong don");
//        typesRepository.save(types);
//
//        LandLord landLord = new LandLord();
//        landLord.setName("thaiCN");
//        landLord.setPhone("729348");
//        landLordRepository.save(landLord);
//
//        Room room =new Room();
//        room.setAvailable("jsdklfjslf");
//        room.setPrice(15000);
//        room.setLandLord1(landLord);
//        room.setTypes(types);
//        roomRepository.save(room);
//
//        Post post = new Post();
//        post.setTitle("thue phong");
//        post.setDescription("lsdfjlasdfkjjadflk");
//        post.setLandLord(landLord);
//        post.setRoom(room);
//        postRepositoy.save(post);
//
//
//        Renter renter = new Renter();
//        renter.setName("thaiNT");
//        renter.setPhone("23974598");
//        renter.setCccd("382905830");
//        renter.setRoom(room);
//        renterRepository.save(renter);
    }
}
