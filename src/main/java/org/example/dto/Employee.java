package org.example.dto;

import lombok.*;
import org.example.util.Departments;

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
}
