package com.gravis.springboot_test.util;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.gravis.springboot_test.dto.UserCreationDTO;
import com.gravis.springboot_test.dto.UserDTO;
import com.gravis.springboot_test.model.User;

@Component
public class UserMapper {
    
    // To DTO

    public UserDTO toDTO(User user) {
        return new UserDTO(
            user.getId(),
            user.getName(),
            user.getAge()
        );
    }

    public List<UserDTO> toDTOList(List<User> users) {
        return users.stream()
            .map(this::toDTO)
            .collect(Collectors.toList());
    }

    // To Entity

    public User toEntity(UserCreationDTO userCreationDTO) {
        User user = new User();
        user.setName(userCreationDTO.getName());
        user.setAge(userCreationDTO.getAge());
        return user;
    }

    public User updateEntityFromDTO(User user, UserDTO userDTO) {
        user.setName(userDTO.getName());
        user.setAge(userDTO.getAge());
        return user;
    }
}