package com.gravis.springboot_test.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public abstract class BaseUserDTO {
    
    @NotNull
    @Size(max = 255)
    private String name;

    @NotNull
    @Min(value = 0)
    @Max(value = 200)
    private Integer age;

    // Constructeurs

    public BaseUserDTO() { }

    public BaseUserDTO(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    // Getters / setters

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
