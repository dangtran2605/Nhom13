package com.Nhom13.Lab8.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotEmpty(message = "Category's name must not be empty")
    @Size(max=30, min = 1, message = "Room's name must be less than 30 characters")
    private String name;
}
