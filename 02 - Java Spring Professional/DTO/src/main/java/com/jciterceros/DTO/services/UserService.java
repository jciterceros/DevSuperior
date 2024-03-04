package com.jciterceros.DTO.services;

import com.jciterceros.DTO.dto.UserDTO;
import com.jciterceros.DTO.entities.User;
import com.jciterceros.DTO.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // find a user by id
    @Transactional(readOnly = true)
    public UserDTO findById(Long id) {
        User entity = userRepository.findById(id).get();
        UserDTO dto = new UserDTO(entity);
        return dto;
    }

    // find all users
    @Transactional(readOnly = true)
    public List<UserDTO> findAll() {
        List<UserDTO> userDTOList = new ArrayList<>();
        Iterable<User> users = userRepository.findAll();
        for (User user : users) {
            userDTOList.add(new UserDTO(user));
        }
        return userDTOList;
    }

    // save a user
    @Transactional(readOnly = false)
    public User save(User user) {
        return userRepository.save(user);
    }

    // delete a user
    @Transactional(readOnly = false)
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    // update a user
    @Transactional(readOnly = false)
    public UserDTO update(Long id, User user) {
        User entity = userRepository.findById(id).get();
        entity.setName(user.getName());
        entity.setPassword(user.getPassword());
        return new UserDTO(userRepository.save(entity));
    }
}
