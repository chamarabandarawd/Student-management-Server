package org.codewavelab.service;

import org.codewavelab.model.Student;

import java.util.ArrayList;

public class StudentService {

    public ArrayList<Student> getStudentList(){
        ArrayList<Student> studentList = new ArrayList<>();

        //Creating dummy student List
        //TODO: Integrate with database to actual students
        studentList.add(Student.builder().firstName("Chamara").LastName("Bandara").contactNumber("0719130861").build());
        studentList.add(Student.builder().firstName("Sumudu").LastName("Nishadi").contactNumber("0759130868").build());
        return studentList;
    }

}
