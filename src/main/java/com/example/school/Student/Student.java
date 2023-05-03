package com.example.school.Student;

import com.example.school.Clazz.Clazz;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@Entity
@Table(name = "sudents")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @ManyToOne
    @NotNull
    private Clazz clazz;

//    @ManyToMany
//    List<Course> courses;
}
