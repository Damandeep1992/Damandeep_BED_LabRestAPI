package com.gtlearning.students.service;

import java.util.List;

import com.gtlearning.students.model.Student;

public interface StudentService {
List<Student> getAllStudents();
void saveStudent(Student student);
Student getStudentById(long id);
void deleteStudentById(long id);
}
