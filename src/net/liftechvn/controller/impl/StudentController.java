package net.liftechvn.controller.impl;

import net.liftechvn.controller.IStudentController;
import net.liftechvn.model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * This is class implement interface IStudentController to show Abstraction
 */
public class StudentController implements IStudentController {

    /**Initialize list student to contain the mock data*/
    List<Student> students = new ArrayList<>();

    /**
     *Because this method is an abstract method of the interface IStudentController, we have to override it to implement the method
     * */
    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter age:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter address:");
        String address = scanner.nextLine();
        System.out.println("Enter phone:");
        String phone = scanner.nextLine();
        System.out.println("Enter fee:");
        int fee = Integer.parseInt(scanner.nextLine());

        /**
         * This is statement initialized a student object.
         * You can also replace the initialization by using function overloading to show polymorphism.
         *example: Student student = new Student(name,age,address,phone,fee)
         *
         * Note:when you instantiate an object, all the private properties of that object cannot be accessed directly from the outside
         * you can only use public method to interact it like the example using setName() method below.
         * This demonstrates the encapsulation of OOP
         * */
        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        student.setPhone(phone);
        student.setFee(fee);
//        Student student = new Student(name,age,address,phone,fee);
        students.add(student);
    }

    @Override
    public void edit(String name) {
        for (Student student : students) {
            if (student.getName().equals(name)) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter new age:");
                int nAge = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter  new address:");
                String nAddress = scanner.nextLine();
                System.out.println("Enter new phone:");
                String nPhone = scanner.nextLine();
                System.out.println("Enter new age:");
                int nFee = Integer.parseInt(scanner.nextLine());

                Student std = new Student();
                std.setName(student.getName());
                std.setAge(nAge);
                std.setAddress(nAddress);
                std.setPhone(nPhone);
                std.setFee(nFee);
                students.set(students.indexOf(student), std);
            }
        }
    }

    @Override
    public void delete(String name) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getName().equals(name)) {
                iterator.remove();
            }
        }
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

}