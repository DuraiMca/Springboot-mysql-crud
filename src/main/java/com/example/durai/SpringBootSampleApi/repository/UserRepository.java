package com.example.durai.SpringBootSampleApi.repository;

import com.example.durai.SpringBootSampleApi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository  extends JpaRepository<User,Long> {
}
