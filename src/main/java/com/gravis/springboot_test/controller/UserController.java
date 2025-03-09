package com.gravis.springboot_test.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.gravis.springboot_test.dto.UserCreationDTO;
import com.gravis.springboot_test.dto.UserDTO;
import com.gravis.springboot_test.model.User;
import com.gravis.springboot_test.service.UserService;
import com.gravis.springboot_test.util.UserMapper;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/users")
public class UserController {
    
    private final UserService userService;
    private final UserMapper userMapper;

    @Autowired
    public UserController(UserService userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        List<UserDTO> userDTOs = userMapper.toDTOList(users);
        return new ResponseEntity<>(userDTOs, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        UserDTO userDTO = userMapper.toDTO(user);
        return new ResponseEntity<>(userDTO, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@Valid @RequestBody UserCreationDTO userCreationDTO) {
        User userToCreate = userMapper.toEntity(userCreationDTO);
        User createdUser = userService.createUser(userToCreate);
        UserDTO userDTO = userMapper.toDTO(createdUser);
        return new ResponseEntity<>(userDTO, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> updateUser(@PathVariable Long id, @Valid @RequestBody UserDTO userDTO) {
        User existingUser = userService.getUserById(id);
        userMapper.updateEntityFromDTO(existingUser, userDTO);
        User updateUser = userService.updateUser(id, existingUser);
        UserDTO updateUserDTO = userMapper.toDTO(updateUser);
        return new ResponseEntity<>(updateUserDTO, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}