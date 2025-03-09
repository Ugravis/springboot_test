package com.gravis.springboot_test.dto;

public class UserDTO extends BaseUserDTO {

    private Long id;

    // Constructeurs

    public UserDTO() {
        super();
    }

    public UserDTO(Long id, String name, Integer age) {
        super(name, age);
        this.id = id;
    }

    // Getters / setters pour id

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
}