package com.example.school.Student;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class StudentDto {
    private Long id;

    @NotBlank
    private String name;

    @NotNull
    private Long clazzId;

    // many students to many courses
}
