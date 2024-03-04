package com.jciterceros.DTO.controllers;

import com.jciterceros.DTO.dto.UserDTO;
import com.jciterceros.DTO.entities.User;
import com.jciterceros.DTO.services.UserService;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserService userService;

    // find user by id
    @GetMapping(value = "/{id}")
    public UserDTO findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    // find all users
    @GetMapping(value = "/all")
    public List<UserDTO> findAll() {
        return userService.findAll();
    }

    // save a user
    @PostMapping(value = "/save")
    public User save(@RequestBody User user) {
        System.out.println(user.toString());
        return userService.save(user);
    }

    // delete a user
    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }

    // update a user
    @PutMapping(value = "/update/{id}")
    public UserDTO update(@PathVariable Long id, @RequestBody User user) {
        System.out.println(user.toString());
        return userService.update(id, user);
    }
}
