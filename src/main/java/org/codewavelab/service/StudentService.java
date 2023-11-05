package org.codewavelab.service;

import lombok.extern.slf4j.Slf4j;
import org.codewavelab.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class StudentService {


    public List<Student> getStudentList(){
        ArrayList<Student> studentList = new ArrayList<>();

        //Creating dummy student List
        //TODO: Integrate with database to actual students
        studentList.add(Student.builder().firstName("Chamara").lastName("Bandara").contactNumber("0719130861").age("24").build());
        studentList.add(Student.builder().firstName("Sumudu").lastName("Nishadi").contactNumber("0759130868").age("53").build());
        return studentList;
    }

    public void saveStudent(Student student){
        //TODO: need to save student to database
        log.debug(student.toString());

    }

}
