package com.example.RegistrationProject.Repo;

import com.example.RegistrationProject.Entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student, String> {


}
