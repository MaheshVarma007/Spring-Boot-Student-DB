package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
    public List<Student> StudentInfo(){
        return studentRepository.findAll();
    }

    public Optional<Student> getSt(long id){
        return studentRepository.findById(id);

    }

    public Student add(Student st){
        studentRepository.save(st);
        return st;
    }
    public Student update(Student st){
        studentRepository.save(st);
        return st;
    }

    public void delete(long id){
        Student st=studentRepository.getReferenceById(id);
        studentRepository.delete(st);
        System.out.println(st+"Deleted");
    }
}
