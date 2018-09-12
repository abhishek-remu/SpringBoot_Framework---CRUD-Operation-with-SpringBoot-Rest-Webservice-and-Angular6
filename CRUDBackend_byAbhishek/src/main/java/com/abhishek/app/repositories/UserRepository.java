package com.abhishek.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.abhishek.app.entities.User;



public interface UserRepository extends JpaRepository<User, Long> {

}
