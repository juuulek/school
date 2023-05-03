package com.example.school.Student;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class StudentDto {
    private Long id;

    @NotBlank
    private String name;

    private long clazzId;

    // many students to many courses
}
