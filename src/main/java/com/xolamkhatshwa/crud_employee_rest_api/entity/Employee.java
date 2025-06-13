package com.xolamkhatshwa.crud_employee_rest_api.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name="employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Size(min = 1, max = 20)
    @Column(name="first_name")
    private String firstName;

    @Min(value = 1)
    @Max(value = 20)
    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;
}
