package com.example.Dosify.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Dosify.model.User;
@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

}

