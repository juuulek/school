package com.example.school.Student;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
public class StudentDto {
    private Long id;

    @NotBlank
    private String name;

    @NotNull
    private Long clazzId;

    private List<Long> courseIds;
}
