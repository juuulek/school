package com.example.school.Student;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<StudentDto>> getAll() {
        List<StudentDto> students = studentService.getAll();
        return students.isEmpty() ? ResponseEntity.notFound().build() : ResponseEntity.ok(students);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> get(@PathVariable Long id) {
        StudentDto student = studentService.get(id);
        return student == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(student);
    }

    @PostMapping
    public ResponseEntity<StudentDto> add(@RequestBody @Valid StudentDto studentDto) {
        studentDto = studentService.add(studentDto);
        return ResponseEntity.ok(studentDto);
    }
}
