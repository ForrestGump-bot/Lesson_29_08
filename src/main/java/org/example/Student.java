package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;


@Getter

@Setter
public class Student implements Serializable {
    private final int EDUCATION_LENGTH = 4;
    private int age;
    private int grade;
    private String name;
    private StudentType st;

    public Student(int age, int grade, String name, StudentType st) {
        this.age = age;
        this.grade = grade;
        this.name = name;
        this.st = st;
    }
}
