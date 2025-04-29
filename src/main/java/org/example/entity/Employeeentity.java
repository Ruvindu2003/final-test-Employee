package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.util.Departments;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(  name = "Employee")

public class Employeeentity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String email;
    @Enumerated(EnumType.STRING)
    private Departments departments;


}
