package com.example.demo.student;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Student {
    @Id

    private Long id;
    private String name;
    private Integer age;
    private LocalDate dob;
    private String email;

    public Student() {
    }

    public Student(String name, Long id, Integer age, LocalDate dob, String email) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.dob = dob;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                '}';
    }
}
