package com.example.school.Student;


import com.example.school.Course.Course;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.ArrayList;
import java.util.List;

@Mapper(componentModel = "spring")
public interface StudentMapper {
    @Mapping(source = "clazzId", target = "clazz.id")
    @Mapping(source = "courseIds", target = "courses")
    Student mapToEntity(StudentDto dto);

    @Mapping(source = "clazz.id", target = "clazzId")
    @Mapping(source = "courses", target = "courseIds")
    StudentDto mapToDto(Student entity);

    List<StudentDto> mapToDto(List<Student> entities);

    default Long mapToCourseId(Course course) {
        return course.getId();
    }

    default List<Course> mapToCourses(List<Long> courseIds) {
        List<Course> courses = new ArrayList<>();
        for (Long courseId : courseIds) {
            courses.add(new Course(courseId));
        }
        return courses;
    }
}
