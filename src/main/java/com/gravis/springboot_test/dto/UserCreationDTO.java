package com.gravis.springboot_test.dto;

public class UserCreationDTO extends BaseUserDTO {

    // Constructeurs

    public UserCreationDTO() {
        super();
    }

    public UserCreationDTO(String name, Integer age) {
        super(name, age);
    }
}
