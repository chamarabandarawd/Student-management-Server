package org.codewavelab;

import org.codewavelab.model.Student;
import org.codewavelab.service.StudentService;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        StudentService service =new StudentService();
        ArrayList<Student> students=service.getStudentList();
        System.out.println(students);
    }
}