package com.example.RegistrationProject.Service;

import com.example.RegistrationProject.Entity.Student;
import com.example.RegistrationProject.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {


    @Autowired
    private StudentRepo repo;

    public void saveorUpdate(Student students) {
        repo.save(students);
    }

    public Iterable<Student> listAll() {
        return this.repo.findAll();
    }

    public void deleteStudent(String id) {

        repo.deleteById(id);
    }

    public Student getStudentByID(String studentid) {

         return repo.findById(studentid).get();
    }
}
