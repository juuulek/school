package com.example.school.Student;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    private final StudentMapper studentMapper;

    public List<StudentDto> getAll() {
        return studentMapper.mapToDto(studentRepository.findAll());
    }

    public StudentDto get(Long id) {
        return studentMapper.mapToDto(studentRepository.findById(id).orElse(null));
    }

    public StudentDto add(StudentDto studentDto) {
        Student student = studentMapper.mapToEntity(studentDto);
        Assert.isNull(student.getId());
        studentRepository.save(student);
        return studentMapper.mapToDto(student);
    }
}
