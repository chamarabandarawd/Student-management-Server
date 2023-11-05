package org.codewavelab.controller;

import lombok.extern.slf4j.Slf4j;
import org.codewavelab.model.Student;
import org.codewavelab.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("students")
@CrossOrigin
public class StudentController {

    StudentService service=new StudentService();

    @GetMapping()
    List<Student> getStudentList(){
        return service.getStudentList();
    }

    @GetMapping("/by-first-name/{firstName}")
    List<Student> getStudentBYFistName(@PathVariable String firstName){
        log.debug(firstName);
        return null;
    }


    @PostMapping()
    void saveStudent(@RequestBody  Student student){
        service.saveStudent(student);
    }

}
