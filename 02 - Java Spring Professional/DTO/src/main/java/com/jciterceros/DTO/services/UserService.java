package com.jciterceros.DTO.services;

import com.jciterceros.DTO.dto.UserDTO;
import com.jciterceros.DTO.entities.User;
import com.jciterceros.DTO.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Transactional(readOnly = true)
    public UserDTO findById(Long id) {
        User entity = userRepository.findById(id).get();
//        UserDTO dto = new UserDTO(entity);
        return new UserDTO(entity);
    }
}
