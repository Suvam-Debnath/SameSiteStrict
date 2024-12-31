package com.example.demo;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private String tech;

    // No-argument constructor
    public Student() {
    }

    // All-arguments constructor
    public Student(int id, String name, String tech) {
        this.id = id;
        this.name = name;
        this.tech = tech;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tech='" + tech + '\'' +
                '}';
    }

    // Override equals method for object comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Objects.equals(name, student.name) &&
                Objects.equals(tech, student.tech);
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(id, name, tech);
    }
}
