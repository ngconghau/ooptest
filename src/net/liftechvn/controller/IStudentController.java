package net.liftechvn.controller;

import net.liftechvn.model.Student;

import java.util.List;
/**
 * Here I use interface to represent the abstraction of OOP
 * */
public interface IStudentController {
    void add();
    void edit(String name);
    void delete(String name);
    List<Student> getAll();
}
