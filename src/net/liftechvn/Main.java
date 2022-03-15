package net.liftechvn;

import net.liftechvn.controller.IStudentController;
import net.liftechvn.controller.impl.StudentController;
import net.liftechvn.model.PersonalInfo;
import net.liftechvn.model.Student;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        menu();
    }

    public static void menu() {
        IStudentController studentController = new StudentController();
        while (true) {
            System.out.println("1. Add a new student:");
            System.out.println("2. Show all students");
            System.out.println("3. Edit a student:");
            System.out.println("4. Remove a student:");
            System.out.println("5. Exit:");
            System.out.println("Select option");
            Scanner scanner = new Scanner(System.in);
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    studentController.add();
                    break;
                case 2:
                    List<Student> students = studentController.getAll();
                    if (students.isEmpty()) {
                        System.out.println("List student is empty");
                    } else {
                        for (Student std : students) {
                            System.out.println(std.display());
                        }
                    }
                    break;
                case 3:
                    if (studentController.getAll().isEmpty()) {
                        System.out.println("List student is empty");
                    } else {
                        System.out.println("Enter name of student need edit:");
                        String name = scanner.nextLine();
                        studentController.edit(name);
                    }
                    break;
                case 4:
                    if (studentController.getAll().isEmpty()) {
                        System.out.println("List student is empty");
                    } else {
                        System.out.println("Enter name of student need remove:");
                        String name = scanner.nextLine();
                        studentController.delete(name);
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
