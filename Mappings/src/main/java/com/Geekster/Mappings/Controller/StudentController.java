package com.Geekster.Mappings.Controller;

import com.Geekster.Mappings.Model.Student;
import com.Geekster.Mappings.Repository.StudentDao;
import com.Geekster.Mappings.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    public void addstudent(@RequestBody Student student){
        studentService.save(student);
    }
}
