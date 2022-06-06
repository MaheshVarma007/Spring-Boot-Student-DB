package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class StudentController {
    public StudentService studentservice;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentservice=studentService;
    }
    @GetMapping("/sInfo")
    public List<Student> StudentInfo(){
        return studentservice.StudentInfo();
    }

    @GetMapping("/sInfo/{id}")
    public Optional<Student> getSt(@PathVariable String id){
         return studentservice.getSt(Long.parseLong(id));
    }

    @PostMapping("/sInfo")
    public Student add(@RequestBody Student st){
        return studentservice.add(st);
    }

    @PutMapping("/sInfo")
    public Student update(@RequestBody Student st){
        return studentservice.update(st);
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<HttpStatus> delete(@PathVariable String id){
        try{
            studentservice.delete(Long.parseLong(id));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
