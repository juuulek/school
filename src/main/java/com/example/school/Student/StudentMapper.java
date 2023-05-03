package com.example.school.Student;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    Student mapToEntity(StudentDto dto);

    @Mapping(source = "clazz.id", target = "clazzId")
    StudentDto mapToDto(Student entity);

    List<StudentDto> mapToDto(List<Student> entities);
}
