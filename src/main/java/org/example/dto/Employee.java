package org.example.dto;

import lombok.*;
import org.example.util.Departments;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Long id;
    private String name;
    private String email;
    private Departments departments;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
