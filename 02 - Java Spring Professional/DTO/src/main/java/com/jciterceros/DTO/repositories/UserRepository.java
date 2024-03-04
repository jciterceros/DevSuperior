package com.jciterceros.DTO.repositories;

import com.jciterceros.DTO.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
