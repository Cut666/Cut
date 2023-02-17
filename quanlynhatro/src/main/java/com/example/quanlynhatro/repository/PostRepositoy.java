package com.example.quanlynhatro.repository;

import com.example.quanlynhatro.model.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepositoy extends JpaRepository<Post,Integer> {
}
